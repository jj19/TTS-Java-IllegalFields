public class Main {
    int 123illegalField;   // Illegal field name
    int uninitializedField;   // Uninitialized field
    String uninitializedStringField;   // Uninitialized String field

    public static void main(String[] args) {
        IllegalNamesAndUninitialized obj = new IllegalNamesAndUninitialized();

        System.out.println("Illegal field: " + obj.123illegalField);   // Reference to an illegal field
        System.out.println("Uninitialized int field: " + obj.uninitializedField);
        System.out.println("Uninitialized String field: " + obj.uninitializedStringField);

        int uninitializedVariable;   // Uninitialized local variable
        System.out.println("Uninitialized local variable: " + uninitializedVariable);
    }
}
