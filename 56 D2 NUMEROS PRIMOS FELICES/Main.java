
package juez_virtual;


import java.util.Scanner;
import java.util.*;
public class Main {
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;  
            }
        }
        return true;  
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();   
        List<Integer> numerosFelices = new ArrayList<>();
        numerosFelices.add(1);numerosFelices.add(7);numerosFelices.add(10);numerosFelices.add(13);numerosFelices.add(19);
        numerosFelices.add(23);numerosFelices.add(28);numerosFelices.add(31);numerosFelices.add(32);numerosFelices.add(44);
        numerosFelices.add(49);numerosFelices.add(68);numerosFelices.add(70);numerosFelices.add(79);numerosFelices.add(82);
        numerosFelices.add(86);numerosFelices.add(91);numerosFelices.add(94);numerosFelices.add(97);numerosFelices.add(100);
        numerosFelices.add(103);numerosFelices.add(109);numerosFelices.add(129);numerosFelices.add(130);numerosFelices.add(133);
        numerosFelices.add(139);numerosFelices.add(167);numerosFelices.add(176);numerosFelices.add(188);numerosFelices.add(190);
        numerosFelices.add(192);numerosFelices.add(193);numerosFelices.add(203);numerosFelices.add(208);numerosFelices.add(219);
        numerosFelices.add(226);numerosFelices.add(230);numerosFelices.add(236);numerosFelices.add(239);numerosFelices.add(262);
        numerosFelices.add(263);numerosFelices.add(280);numerosFelices.add(291);numerosFelices.add(293);numerosFelices.add(301);
        numerosFelices.add(302);numerosFelices.add(310);numerosFelices.add(313);numerosFelices.add(319);numerosFelices.add(320);
        numerosFelices.add(326);numerosFelices.add(329);numerosFelices.add(331);numerosFelices.add(338);numerosFelices.add(356);
        numerosFelices.add(362);numerosFelices.add(365);numerosFelices.add(367);numerosFelices.add(368);numerosFelices.add(376);
        numerosFelices.add(379);numerosFelices.add(383);numerosFelices.add(386);numerosFelices.add(391);numerosFelices.add(392);
        numerosFelices.add(397);numerosFelices.add(404);numerosFelices.add(409);numerosFelices.add(440);numerosFelices.add(446);
        numerosFelices.add(464);numerosFelices.add(469);numerosFelices.add(478);numerosFelices.add(487);numerosFelices.add(490);
        numerosFelices.add(496);numerosFelices.add(536);numerosFelices.add(556);numerosFelices.add(563);numerosFelices.add(565);
        numerosFelices.add(566);numerosFelices.add(608);numerosFelices.add(617);numerosFelices.add(622);numerosFelices.add(623);
        numerosFelices.add(632);numerosFelices.add(635);numerosFelices.add(637);numerosFelices.add(638);numerosFelices.add(644);
        numerosFelices.add(649);numerosFelices.add(653);numerosFelices.add(655);numerosFelices.add(656);numerosFelices.add(665);
        numerosFelices.add(671);numerosFelices.add(673);numerosFelices.add(680);numerosFelices.add(683);numerosFelices.add(694);
        numerosFelices.add(700);numerosFelices.add(709);numerosFelices.add(716);numerosFelices.add(736);numerosFelices.add(739);
        numerosFelices.add(748);numerosFelices.add(761);numerosFelices.add(763);numerosFelices.add(784);numerosFelices.add(790);
        numerosFelices.add(793);numerosFelices.add(802);numerosFelices.add(806);numerosFelices.add(818);numerosFelices.add(820);
        numerosFelices.add(833);numerosFelices.add(836);numerosFelices.add(847);numerosFelices.add(860);numerosFelices.add(863);
        numerosFelices.add(874);numerosFelices.add(881);numerosFelices.add(888);numerosFelices.add(899);numerosFelices.add(901);
        numerosFelices.add(904);numerosFelices.add(907);numerosFelices.add(910);numerosFelices.add(912);numerosFelices.add(913);
        numerosFelices.add(921);numerosFelices.add(923);numerosFelices.add(931);numerosFelices.add(932);numerosFelices.add(937);
        numerosFelices.add(940);numerosFelices.add(946);numerosFelices.add(964);numerosFelices.add(970);numerosFelices.add(973);
        numerosFelices.add(989);numerosFelices.add(998);numerosFelices.add(1000);numerosFelices.add(1003);numerosFelices.add(1009);
        numerosFelices.add(1029);numerosFelices.add(1030);numerosFelices.add(1033);numerosFelices.add(1039);numerosFelices.add(1067);
        numerosFelices.add(1076);numerosFelices.add(1088);numerosFelices.add(1090);numerosFelices.add(1092);numerosFelices.add(1093);
        
        if(esPrimo(z)){
            if(numerosFelices.contains(z)){
                System.out.println("Primo Feliz");
            }
            else{
                System.out.println("Primo Infeliz");
            }
        }
        else{
            System.out.println("No es Primo");
        }
    }
}
   

