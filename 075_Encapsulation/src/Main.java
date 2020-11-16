public class Main {

    public static void main(String[] args) {


//Without encapsulation
//        Player player = new Player();
//        player.name = "Joe";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Joe", 250, "Sword");
        System.out.println("Initial health is " + player.getHitPoint());
    }
}
