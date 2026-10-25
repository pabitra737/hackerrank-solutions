

    static boolean isAnagram(String a, String b) {
        // Anagrams must have equal lengths
        if (a.length() != b.length())
            return false;

        // Ignore uppercase and lowercase differences
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Base condition: both strings are empty
        if (a.length() == 0)
            return true;

        // Take the first character from string a
        char ch = a.charAt(0);

        // Find that character in string b
        int index = b.indexOf(ch);

        // Character not found, so not anagrams
        if (index == -1)
            return false;

        // Remove one character from both strings
        return isAnagram(
            a.substring(1),
            b.substring(0, index) + b.substring(index + 1)
        );
    }

