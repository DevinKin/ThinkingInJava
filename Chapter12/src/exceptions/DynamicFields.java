package exceptions;

import static net.mindview.util.Print.print;

class DynamicFieldsException extends Exception {
}


public class DynamicFields {
    private Object[][] fields;
    public DynamicFields(int initiaSize) {
        fields = new Object[initiaSize][2];
        for (int i = 0; i < initiaSize; i++) {
            fields[i] = new Object[] {null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object[] obj : fields) {
            result.append(obj[0]);
            result.append(": ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (id.equals(fields[i][0]))
                return i;
        }
        return -1;
    }

    private int getFieldNumber(String id) throws NoSuchFieldException {
        int fieldNum = hasField(id);
        if (fieldNum == -1) {
            throw new NoSuchFieldException();
        }
        return fieldNum;
    }

    private int makeField(String id) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {
                fields[i][0] = id;
                return i;
            }
        }
        // No empty fields, Add one:
        Object[][] tmp = new Object[fields.length + 1][2];
        // 拷贝已经满的域
        for (int i = 0; i < fields.length; i++) {
            tmp[i] = fields[i];
        }

        for (int i = fields.length; i < tmp.length; i++) {
            tmp[i] = new Object[] {null, null};
        }
        fields = tmp;
        // Recursive call with expanded fields:
        return makeField(id);
    }

    public Object getField(String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value) throws DynamicFieldsException{
        if (value == null) {
            // Most exceptions don't have a "cause" constructor.
            // In these cases you must use initCause(),
            // available in all Throwable subclasses.
            DynamicFieldsException dfe = new DynamicFieldsException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }

        int fieldNumber = hasField(id);
        if (fieldNumber == -1) {
            fieldNumber = makeField(id);
        }
        Object result = null;
        try {
            // Got old value
            result = getField(id);
        } catch (NoSuchFieldException e) {
            //Use constructor that takes "cause"
            throw new RuntimeException(e);
        }
        fields[fieldNumber][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        print(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            print(df);
            df.setField("d", "A new Value for d");
            df.setField("number3", 11);
            print("df: " + df);
            print("df.getField(\"d\") : " + df.getField("d"));
            // Exception
            Object field = df.setField("d", null);
        } catch (DynamicFieldsException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
