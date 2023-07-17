package com.example.zadachki.indexVhoghdenya;
//        Учитывая две строки needleи haystack, вернуть индекс первого вхождения в needle, haystackили -1если needleне является частью haystack.
//
//
//
//                Пример 1:
//
//        Ввод: стог сена = "sadbutsad", игла = "sad"
//        Вывод: 0
//        Объяснение: "sad" встречается в индексах 0 и 6.
//        Первое вхождение находится в индексе 0, поэтому мы возвращаем 0.
public class Solution {
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;

    }
}
