package TemplateMathod;

public class MainBoard {


    public static void main(String[] args) {
        Player player = new Player();
        player.play(5);

        PlayerLevel level = new AdvancedLevel();
        player.upgradeLevel(level);
        player.play(5);

        PlayerLevel  superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(5);


    }
}
