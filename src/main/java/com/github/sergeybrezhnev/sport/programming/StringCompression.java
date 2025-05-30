package com.github.sergeybrezhnev.sport.programming;

/**
 * Дана строка, содержащая буквы //A-Z//:
 * "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB"
 * Нужно написать функцию RLE, которая выведет строку вида:
 * "A4B3C2XYZD4E3F3A6B28"
 * Еще надо выдавать ошибку, если на ввод приходит недопустимая строка.
 *
 * Примечания:
 * 1. Если символ встречается один раз, он остается неизменным
 * 2. Если символ встречается более одного раза, к нему добавляется число повторений
 */
public class StringCompression {
    public static String rle(String stringBeforeCompression) {
        if (stringBeforeCompression == null || stringBeforeCompression.isEmpty()) {
            throw new IllegalArgumentException("Строка отсутствует или пустая строка");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < stringBeforeCompression.length(); i++) {
            char symbol = stringBeforeCompression.charAt(i);
            if (symbol < 'A' || symbol > 'Z') {
                throw new IllegalArgumentException("Неверный формат строки");
            }

            int charCount = 1;
            //Условия нельзя поменять местами, иначе indexOutOfBoundException
            while (i < stringBeforeCompression.length() - 1 && symbol == stringBeforeCompression.charAt(i + 1)) {
                charCount++;
                i++;
            }

            result.append(symbol);
            if (charCount > 1) {
                result.append(charCount);
            }
        }

        return result.toString();
    }
}
