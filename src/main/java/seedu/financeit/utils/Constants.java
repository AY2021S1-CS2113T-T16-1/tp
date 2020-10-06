package seedu.financeit.utils;

public class Constants {
    public static final String[] DEFAULT_EXP_CAT = {"TRANSPORT", "FOOD", "TRAVEL", "SHOPPING", "BILLS"};
    public static final String[] DEFAULT_INC_CAT = {"ALLOWANCE", "WAGES", "BONUS"};
    public static final String[] DEFAULT_PARAMS_PREFIX = {"/", "-"};
    public static final int MAX_PARTITION_LINE_LEN = 60;

    public enum EntryType {
        EXP,
        INC
    }

    // Regex detects the following: <whitespace>/<word><whitespace>
    public static final String paramRegex = String.format("(\\s+)([%s]{1})(\\w+)(\\s+)",
            String.join("", DEFAULT_PARAMS_PREFIX));
}