import java.util.Scanner;

class SomnetService {

    static Scanner input = new Scanner(System.in);
    static double balance = 1000.0;

    public static void main(String[] args) {

        System.out.print("Dial *100#: ");
        String code = input.nextLine();
        if (code.equals("*100#")) {
            showMenu();
        } else {
            System.out.println("USSD Code Khaldan!");
        }
    }

    public static void showMenu() {

        int choice;

        do {
            System.out.println("\n====== SOMNET ======");
            System.out.println("1. Itus Haragga");
            System.out.println("2. Maaroynta");
            System.out.println("3. PIN-PUK");
            System.out.println("4. Lacag Qaldantay");
            System.out.println("5. Adeegyada Somnet");
            System.out.println("6. VIP Numbers");
            System.out.println("7. Wadamada Bulaal");
            System.out.println("8. Agent");
            System.out.println("9. Ka bax");

            System.out.print("Dooro: ");
            choice = input.nextInt();

            processChoice(choice);

        } while (choice != 9);
    }

    public static void processChoice(int choice) {


        switch (choice) {

            case 1:
                System.out.println("\n--- Itus Haragga ---");
                System.out.println("Haraagaagu waa: $" + balance);
                break;

            case 2:
                int mareynta;

                do {
                    System.out.println("\n--- Maaroynta ---");
                    System.out.println("1. Internet Configuration");
                    System.out.println("2. Isdiiwaangelin");
                    System.out.println("3. Bedel Luuqada");
                    System.out.println("9. Ka bax");

                    System.out.print("Dooro: ");
                    mareynta = input.nextInt();

                    switch (mareynta) {

                        case 1:
                            System.out.println("Wait few minutes");
                            break;

                        case 2:
                            input.nextLine(); // Clear Buffer
                            System.out.print("Geli Magacaaga oo Saddexan: ");
                            String name = input.nextLine();
                            System.out.println("Waad ku guuleysatay isdiiwaangelinta.");
                            System.out.println("Magacaagu waa: " + name);
                            break;

                        case 3:
                            int language;

                            do {
                                System.out.println("\n--- Bedel Luuqada ---");
                                System.out.println("1. Somali");
                                System.out.println("2. English");
                                System.out.println("9. Ka bax");

                                System.out.print("Dooro: ");
                                language = input.nextInt();

                                switch (language) {
                                    case 1:
                                        System.out.println("You change language.");
                                        break;

                                    case 2:
                                        System.out.println("You change language.");
                                        break;

                                    case 9:
                                        System.out.println("Dib ugu laabo Maaroynta.");
                                        break;

                                    default:
                                        System.out.println("Doorasho Khaldan.");
                                }

                            } while (language != 9);
                            break;

                        case 9:
                            System.out.println("Dib ugu laabo Menu-ga weyn.");
                            break;

                        default:
                            System.out.println("Doorasho Khaldan.");
                    }

                } while (mareynta != 9);
                break;



            case 3:
                System.out.println("\n--- PIN-PUK ---");
                System.out.print("Gali Telephone Number-ka: ");
                String phone = input.next();
                System.out.println("Number-ka: " + phone);
                break;

            case 4:
                System.out.println("\n--- Lacag Qaldantay ---");
                System.out.print("Gali Number-ka Qaldamay: ");
                String wrong = input.next();
                System.out.println("Waxaad gelisay: " + wrong);
                break;

            case 5:
                int service;

                do {
                    System.out.println("\n--- Adeegyada Somnet ---");
                    System.out.println("1. Isticmaal Adeega GSM-ka");
                    System.out.println("2. Xirmoyinka Somnet");
                    System.out.println("9. Ka bax");

                    System.out.print("Dooro: ");
                    service = input.nextInt();

                    switch (service) {

                        case 1:
                            int gsm;
                            do {
                                System.out.println("\n--- Adeega GSM-ka ---");
                                System.out.println("1. Code-yada SIM-ka");
                                System.out.println("2. Jeep");
                                System.out.println("3. EVCPLUS");
                                System.out.println("4. Merchant");
                                System.out.println("5. Reseller");
                                System.out.println("6. Code-yada");
                                System.out.println("7. Ka bax");

                                System.out.print("Dooro: ");
                                gsm = input.nextInt();

                                switch (gsm) {
                                    case 1:
                                        System.out.println("Code-yada SIM-ka");
                                        break;
                                    case 2:
                                        System.out.println("Jeep");
                                        break;
                                    case 3:
                                        System.out.println("EVCPLUS");
                                        break;
                                    case 4:
                                        System.out.println("Merchant");
                                        break;
                                    case 5:
                                        System.out.println("Reseller");
                                        break;
                                    case 6:
                                        System.out.println("Code-yada");
                                        break;
                                    case 7:
                                        System.out.println("Dib ugu laabo Adeegyada Somnet");
                                        break;
                                    default:
                                        System.out.println("Doorasho Khaldan");
                                }

                            } while (gsm != 9);
                            break;

                        case 2:
                            int packageChoice;
                            do {
                                System.out.println("\n--- Xirmoyinka Somnet ---");
                                System.out.println("1. Xirmoyinka Qanciye");
                                System.out.println("2. Xirmoyinka Maqsuud");
                                System.out.println("3. Xirmoyinka Mifi+");
                                System.out.println("4. Xirmoyinka Bulaal");
                                System.out.println("9. Ka bax");

                                System.out.print("Dooro: ");
                                packageChoice = input.nextInt();

                                switch (packageChoice) {
                                    case 1:
                                        System.out.println("Waxaad dooratay Xirmoyinka Qanciye");
                                        break;
                                    case 2:
                                        System.out.println("Waxaad dooratay Xirmoyinka Maqsuud");
                                        break;
                                    case 3:
                                        System.out.println("Waxaad dooratay Xirmoyinka Mifi+");
                                        break;
                                    case 4:
                                        System.out.println("Waxaad dooratay Xirmoyinka Bulaal");
                                        break;
                                    case 9:
                                        System.out.println("Dib ugu laabo Adeegyada Somnet");
                                        break;
                                    default:
                                        System.out.println("Doorasho Khaldan");
                                }

                            } while (packageChoice != 9);
                            break;

                        case 9:
                            System.out.println("Dib ugu laabo Menu-ga weyn");
                            break;

                        default:
                            System.out.println("Doorasho Khaldan");
                    }

                } while (service != 9);
                break;

            case 6:
                int vip;

                do {
                    System.out.println("\n--- VIP Numbers ---");
                    System.out.println("1. Golden VIP");
                    System.out.println("2. Silver VIP");
                    System.out.println("9. Ka bax");

                    System.out.print("Dooro: ");
                    vip = input.nextInt();

                    switch (vip) {

                        case 1:
                            int golden;
                            do {
                                System.out.println("\n--- Golden VIP ---");
                                System.out.println("1. 6811111111 - $49.50");
                                System.out.println("2. 68000011 - $49.50");
                                System.out.println("3. 68000000 - $49.50");
                                System.out.println("4. 68000000 - $49.50");
                                System.out.println("5. 68000000 - $49.50");
                                System.out.println("6. 68000000 - $49.50");
                                System.out.println("7. 68000000 - $49.50");
                                System.out.println("9. Ka bax");

                                System.out.print("Dooro: ");
                                golden = input.nextInt();

                                switch (golden) {
                                    case 1:
                                        System.out.println("Waxaad dooratay 6811111111");
                                        break;
                                    case 2:
                                        System.out.println("Waxaad dooratay 68000011");
                                        break;
                                    case 3:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 4:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 5:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 6:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 7:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 9:
                                        System.out.println("Dib ugu laabo VIP Menu");
                                        break;
                                    default:
                                        System.out.println("Doorasho Khaldan");
                                }

                            } while (golden != 9);
                            break;

                        case 2:
                            int silver;
                            do {
                                System.out.println("\n--- Silver VIP ---");
                                System.out.println("1. 68000000 - $19.50");
                                System.out.println("2. 68000000 - $19.50");
                                System.out.println("3. 68000000 - $19.50");
                                System.out.println("4. 68000000 - $19.50");
                                System.out.println("5. 68000000 - $19.50");
                                System.out.println("6. 68000000 - $19.50");
                                System.out.println("7. 68000000 - $19.50");
                                System.out.println("9. Ka bax");

                                System.out.print("Dooro: ");
                                silver = input.nextInt();

                                switch (silver) {
                                    case 1:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 2:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 3:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 4:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 5:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 6:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 7:
                                        System.out.println("Waxaad dooratay 68000000");
                                        break;
                                    case 9:
                                        System.out.println("Dib ugu laabo VIP Menu");
                                        break;
                                    default:
                                        System.out.println("Doorasho Khaldan");
                                }

                            } while (silver != 9);
                            break;

                        case 9:
                            System.out.println("Dib ugu laabo Menu-ga weyn");
                            break;

                        default:
                            System.out.println("Doorasho Khaldan");
                    }

                } while (vip != 9);
                break;

            case 7:
                System.out.println("\nSMS ayaa laguu soo diray.");
                break;

            case 8:
                System.out.println("\n--- Agent ---");
                System.out.print("Gali Number-ka: ");
                String num = input.next();
                System.out.println("Number-ka: " + num);
                break;

            case 9:
                System.out.println("\n Waku mahad san tahay isticmalka adega Somnet.");
                break;

            default:
                System.out.println("Doorasho Khaldan!");
        }
    }
}
