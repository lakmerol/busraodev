package Equiments;

public class Loot {

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    private int Count;

    public Loot(String name, int id, int count) {
        this.name = name;
        this.id = id;
        this.Count = count;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
