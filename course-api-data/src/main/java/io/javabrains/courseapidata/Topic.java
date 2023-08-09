package io.javabrains.courseapidata;
public class Topic
{
    private String id;
    private String name;
    private String description;

    public Topic()
    {
    }

    public Topic(String id, String name, String destription){
        super();
        this.id = id;
        this.name = name;
        this.description = destription ;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}