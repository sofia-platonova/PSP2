package lab;
import myClass.Tribe;
public class Runner {
    public static void main(String[] args) {
        Tribe []tribe = new Tribe[4];
        tribe[0] = new Tribe("Папуасы", 450, true);
        tribe[1]=new Tribe("Апачи",300);
        tribe[2]=new Tribe();
        tribe[3]=new Tribe(tribe[0]);
        for(int i=0;i<4;i++){
            tribe[i].print();
        }
        System.out.println("Общая численность людей в племенах, знакомых с огнём: "+ Tribe.fireFriendlyPeople(tribe));
        System.out.println("Общая численность племён, знакомых с огнём: "+ Tribe.fireFriendlyTribes(tribe));
    }
}