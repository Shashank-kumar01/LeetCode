class Solution {
    public int compress(char[] chars) {

        int i = 0; //read pointer
        int indx = 0;//write pointer

        while (i < chars.length) {
            char current = chars[i];

            int count = 0;

            while (i < chars.length && chars[i] == current) {
                count++;
                i++;
            }

            chars[indx++] = current;

            if (count > 1) {
                String str = Integer.toString(count); // because count store integer value and ee have to convert it into string to write in this array
                for (int j = 0; j < str.length(); j++) {
                    chars[indx++] = str.charAt(j);
                }
            }
        }
        return indx;
    }
}