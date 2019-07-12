package builder;

public class Demo {
    public static void main(String[] args) {
//        String hello = "hello";
//
//        System.out.println("<p>" + hello + "</p>");
//
//        String[] words = {"Hello", "World"};
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("<ul>\n");
//
//        for(String word: words){
//            sb.append(String.format("  <li>%s</li>\n", word));
//        }
//        sb.append("</ul>");
//        System.out.println(sb);
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li", "hello")
                .addChild("li", "world");


        System.out.println(builder);

        EmployeeBuilder pb = new EmployeeBuilder();

        Person person = pb.withName("pera")
                .worksAt("Developer")
                .build();
        System.out.println(person);

        //Builder Facade

        PersonImprovedBuilder personImprovedBuilder = new PersonImprovedBuilder();

        PersonImproved personImproved = personImprovedBuilder
                .lives()
                    .in("London")
                    .at("foo Stret 1")
                    .withPostcode("12345")
                .works()
                    .at("Fabrikam")
                    .asA("Engineer")
                    .earns(123000)
                .build();
        System.out.println(personImproved);
    }
}
