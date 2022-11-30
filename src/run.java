public class run {
    public static void main(String[] args) {
        StudentsDomBuilder domBuilder = new StudentsDomBuilder();
        domBuilder.buildSetStudents("/Users/islammambetakunov/IdeaProjects/bookEX/src/students.xml");
        System.out.println(domBuilder.getStudents());
    }
}