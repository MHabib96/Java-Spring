public class StringConcatenationSpeed {

    public static void main(String[] args) {

        //Showcasing speed difference between StringBuilder append and standard String concatenation.

        //count = 100     |  StringBuilder speed = 0  |  String Concatenation = 0
        //count = 1000    |  StringBuilder speed = 0  |  String Concatenation = 3
        //count = 10000   |  StringBuilder speed = 1  |  String Concatenation = 109
        //count = 100000  |  StringBuilder speed = 4  |  String Concatenation = 6891
        //count = 1000000 |  StringBuilder speed = 13 |  String Concatenation = 262753

        long count = 1000000;
        System.out.println("StringBuilder speed: "+stringBuilderSpeed(count));
        System.out.println("stringConc speed: "+stringConcSpeed(count));

    }

    private static long stringConcSpeed(long count) {
        String str = "";
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < count; i++)
            str += 'a';
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static long stringBuilderSpeed(long count) {
        StringBuilder sb = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < count; i++)
            sb.append('a');
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

}
