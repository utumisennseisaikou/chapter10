//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {
    public static void main(String[] args) {

        SuperHero sh = new SuperHero();
   //     Hero h = new Hero();
        sh.fly();
        sh.run();
        sh.slip();
        sh.test();
    }
}