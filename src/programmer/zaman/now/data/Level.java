package programmer.zaman.now.data;

public enum Level {
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    private String description;

    Level(String description){ //Jangan di set sebagai public
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
