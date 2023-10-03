package myClass;

public class Tribe {
    private String name;
    private int count;
    private boolean fireFriendly;
    public static int fireCount = 0;
    public static int countPeople = 0;

    public Tribe(){
        this.name = "no info";
    }

    public Tribe(String name, int count, boolean fire){
        this.name = name;
        this.count = count;
        this.fireFriendly = fire;
    }

    public Tribe( Tribe tribe){
        this.name = tribe.name;
        this.count = tribe.count;
        this.fireFriendly = tribe.fireFriendly;
    }

    public Tribe(String name, int count){
        this.name = name;
        this.count = count;
    }

    public String tribeName(){
        return name;
    }

    public int countPeople() {
        return count;
    }

    public boolean fire() {
        return fireFriendly;
    }

    public static int fireFriendlyPeople(Tribe [] tribes){
        for (Tribe tribe : tribes){
            if (tribe.fire()) {
                countPeople += tribe.countPeople();
            }
        }
        return countPeople;
    }

    public static int fireFriendlyTribes(Tribe [] tribes){
        for (Tribe tribe : tribes){
            if (tribe.fire()) {
                fireCount++;
            }
        }
        return fireCount;
    }

    public void print() {
        System.out.println(this.tribeName()+"\n"+ this.countPeople());
        if(this.fire()){
                System.out.println("Знакомы с огнём.");
       }
        if(!this.fire()){
            System.out.println("Не знакомы с огнём.");
        }
    }
}
