


public static void main(String[] args) {

    List<String> wordList = new ArrayList<>();
    wordList.add("a,b,d, a");
    wordList.add("a,b,c, a");

    Map<String, Boolean> wordBooleanMap = new HashMap<>();
    wordBooleanMap.put("a,b ,d, a", true);
    wordBooleanMap.put("a,b,c, a", true);


    boolean result1 = checkDuplicatesInList(wordList);
    System.out.println("Дубликаты в списке " + result1);
}


private static boolean checkDuplicatesInList(List<String> wordList) {

    return false;
}

