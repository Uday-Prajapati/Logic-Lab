public class EntryUtility {

    public static boolean validateEmployeeId(String employeeId) throws InvalidEntryException {

        if (employeeId.length() != 10) {
            throw new InvalidEntryException("Invalid entry details");
        }

        if (!employeeId.startsWith("GOAIR/")) {
            throw new InvalidEntryException("Invalid entry details");
        }

        String digits = employeeId.substring(6);
        if (!digits.matches("\\d{4}")) {
            throw new InvalidEntryException("Invalid entry details");
        }

        return true;
    }

    public static boolean validateDuration(int duration) throws InvalidEntryException {

        if (duration >= 1 && duration <= 5) {
            return true;
        } else {
            throw new InvalidEntryException("Invalid entry details");
        }
    }
}
