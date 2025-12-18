public class Skill {

    private String type; // What type of skill is this
    private String name; // Name of the skill
    private boolean haveIt;
    private boolean willHave;

    public Skill(String name, String type, boolean haveIt, boolean willHave){
        this.name = name;
        this.type = type;
        this.haveIt = haveIt;
        this.willHave = willHave;
    }

    public Skill(String name, String type){

        this(name,type,false,false);

    }

    public Skill(String name){

        this(name,"");

    }

    public String getName(){return this.name;}

    public String getType(){return this.name;}

    public boolean haveIt(){return this.haveIt;}

    public boolean willHave(){return this.willHave;}

    public String toString(){

        String result = "";

        result += "This is a " + this.type + " skill called " + this.name + ".";

        if(this.haveIt) result += "I currently have this skill.";
        else if (this.willHave) result += "I have a plan to acquire this skill.";
        else result += "I don't have this skill";

        return result;

    }

    public boolean equals(Skill s){

        if(s.getName() == this.name && s.getType() == this.type) return true;
        else return false;

    }
    
}
