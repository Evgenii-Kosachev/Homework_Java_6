/*
    1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
    2. Добавить в множества по 10 случайных целочисленных ключей.
    3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs
    4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
    5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1 15 случайными числами и вывести на печать.
    6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer (-1 при значении  %2==0 ;0 при ==;1 при значении %2!=0). Заполнить tm 15 случайными числами и вывести на печать.
*/

import java.util.*;

public class TaskSolution {
    public static void main(String[] args) {
// 1. Объявить и инициализировать множества HashSet hs, LinkedHashSet lhs и TreeSet ts
        Set<Integer> hs = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> lhs = new LinkedHashSet<>(Arrays.asList(4, 5, 6));
        Set<Integer> ts = new TreeSet<>(Arrays.asList(7, 8, 9));

// 2. Добавить в множества по 10 случайных целочисленных ключей.
        for (int i = 0; i < 10; i++) {
            hs.add(new Random().nextInt(-9, 10));
            lhs.add(new Random().nextInt(-9, 10));
            ts.add(new Random().nextInt(-9, 10));
        }

// 3. Пройти по множеству hs и, при условии наличия соответствующего ключа в множестве lhs, удалить ключ из hs
        hs.removeAll(lhs);

// 4. Пройти по множеству lhs и, при условии отсутствия соответствующего ключа в множестве ts, добавит ключ в ts
        ts.addAll(lhs);

//        System.out.println("hs:  " + hs);
//        System.out.println("lhs: " + lhs);
//        System.out.println("ts:  " + ts);
//        System.out.println();


// 5. Объявить и инициализировать множество TreeSet ts1 с компаратором Integer (-1 при значении %2==0 ;0 при ==;1 при значении %2!=0). Заполнить ts1 15 случайными числами и вывести на печать.
        TreeSet<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer == t1) return 0;
                if (t1 % 2 == 0) return -1;
                else return 1;
            }
        });

        for (int i = 0; i < 15; i++) {
            ts1.add(new Random().nextInt(15));
        }
        System.out.printf("5. TreeSet %s\n", ts1);

// 6. *Объявить и инициализировать множество TreeMap tm с компаратором Integer (-1 при значении  %2==0 ;0 при ==;1 при значении %2!=0). Заполнить tm 15 случайными числами и вывести на печать.
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer == t1) return 0;
                if (t1 % 2 == 0) return -1;
                else return 1;
            }
        });

        for (int i = 0; i < 15; i++) {
            tm.put(new Random().nextInt(15), "");
        }
        System.out.printf("6. TreeMap %s\n", tm);
    }
}
