package java101;
import java.util.*;
public class burcbulma {
	
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ay, gun;

        System.out.print("Doğduğunuz ay: ");
        ay = inp.nextInt();
        System.out.print("Doğduğunuz gün: ");
        gun = inp.nextInt();

        if (ay >= 1 && ay<=12) {
              if (ay == 1) {
                 if (gun >= 0 && gun <= 31) {
                    if (gun <= 21) {
                        System.out.print("Burcunuz oğlak");
                    } else {
                        System.out.print("Burcunuz kova");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz.");
                }
              }
             if (ay == 2) {
                 if (gun >= 0 && gun <= 28) {
                    if (gun <= 19) {
                        System.out.print("Burcunuz kova");
                    } else {
                        System.out.print("Burcunuz balık");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
             }
             if (ay == 3) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 20) {
                        System.out.print("Burcunuz balık");
                    } else {
                        System.out.print("Burcunuz koç");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
             }
            if (ay == 4) {
                if (gun >= 0 && gun <= 30) {
                    if (gun <= 20) {
                        System.out.print("Burcunuz koç");
                    } else {
                        System.out.print("Burcunuz boğa");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 5) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 21) {
                        System.out.print("Burcunuz boğa");
                    } else {
                        System.out.print("Burcunuz ikizler");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 6) {
                if (gun >= 0 && gun <= 30) {
                    if (gun <= 22) {
                        System.out.print("Burcunuz ikizler");
                    } else {
                        System.out.print("Burcunuz yengeç");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 7) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 22) {
                        System.out.print("Burcunuz yengeç");
                    } else {
                        System.out.print("Burcunuz aslan");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 8) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 22) {
                        System.out.print("Burcunuz aslan");
                    } else {
                        System.out.print("Burcunuz başak");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 9) {
                if (gun >= 0 && gun <= 30) {
                    if (gun <= 22) {
                        System.out.print("Burcunuz başak");
                    } else {
                        System.out.print("Burcunuz terazi");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 10) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 22) {
                        System.out.print("Burcunuz terazi");
                    } else {
                        System.out.print("Burcunuz akrep");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 11) {
                if (gun >= 0 && gun <= 30) {
                    if (gun <= 21) {
                        System.out.print("Burcunuz akrep");
                    } else {
                        System.out.print("Burcunuz yay");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
                }
            }
            if (ay == 12) {
                if (gun >= 0 && gun <= 31) {
                    if (gun <= 21) {
                        System.out.print("Burcunuz yay");
                    } else {
                        System.out.print("Burcunuz oğlak");
                    }
                } else {
                    System.out.print("Gün için yanlış değer girdiniz");
            }
        }
    }
        else {
            System.out.print("Ay için yanlış değer girdiniz");
        }
    }
}

