package net.media.training.designpattern_refactored.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        RootXmlBuilder builder = new RootXmlBuilder();
        builder.addRoot("People");
        builder.addEncodingHeader("UTF-8");
        builder.attr("number", persons.size()+"");
        for (final Person person : persons) {
            builder.c("Person",
                    new XML(){{
                            attr("name", person.getName());
                            c("Address", new XML(){{
                                    c("City", person.getCity());
                                    c("Country", person.getCountry());
                                }});
                            attr("id", person.getId()+"");
                        }});
        }
        return builder.toString();
    }

    public static String getPeopleXml2(List<Person> persons) {
        AlternateBuilder builder = new AlternateBuilder("People","UTF-8");
        builder.a("number", persons.size());
        for (final Person person : persons) {
            builder.c("Person").
                    a("name", person.getName()).
                    a("id", person.getId()).
                      c("Address").
                        c("City").t(person.getCity()).up().
                        c("Country").t(person.getCountry()).up().up().up();
        }
        return builder.toString();
    }
}
