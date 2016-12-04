package thymeleafexamples.stsm.business.entities;


public enum Area {

    BEIJING("BEIJING"),
    GUANGZHOU("GUANGZHOU"),
    SHANGHAI("SHANGHAI");


    public static final Area[] ALL = { BEIJING,GUANGZHOU,SHANGHAI };


    private final String name;


    public static Area forName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null for type");
        }
        if (name.toUpperCase().equals("BEIJING")) {
            return BEIJING;
        } else if (name.toUpperCase().equals("GUANGZHOU")) {
            return GUANGZHOU;
        } else if (name.toUpperCase().equals("SHANGHAI")) {
            return SHANGHAI;
        }
        throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Type");
    }


    private Area(final String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }


}

