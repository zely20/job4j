package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int count = 0;
        while (post.length != count) {
            if (post[post.length - 1 - count] != word[word.length - 1 - count]) {
                result = false;
                break;
            }
            count++;
        }
        return result;
    }
}
