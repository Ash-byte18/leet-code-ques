class Solution {
    public String reverseWords(String s) {
        s = s.trim();
          String[] arr = s.split(" +");
        StringBuilder abc = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
        abc.append(arr[i]);
        if (i != 0) {
                abc.append(" ");
            }
        }

        return abc.toString();
    }
}