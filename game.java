import java.util.*;
public class game
{
    String heroes[] =new String[]{"hercules","pikachu","jedi"};//list of characterss
    String villains[]=new String[]{"medusa","Azazel","Lilith"};// list of antagonist characters
    String heroBot,villainBot,choice;
    String hercules[];
    String jace[];
    String pikachu[];
    String jedi[];
    String lilith[];
    String azazel[];
    String medusa[];
    int damage[]=new int[]{23,35,0,66,1,20,15,47,29,8,9,46,0,0,54};
    int health[]=new int[]{12,23,34,45,56,54,43,32,21,10,29,38,47};
    int Hhealth=100,Vhealth=100;
    String hero,villain;
    Scanner sc=new Scanner(System.in);
    public game()
    {
        heroBot="";
        villainBot="";
    }

    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        // user input for character selection
        System.out.println("Do you want to be a hero or a villain?");
        choice=sc.nextLine();
        System.out.println();
        try
        {
            // Delay for 1 seonds
            Thread.sleep(1000);   
        }
        catch(InterruptedException ex)
        {
            ex.printStackTrace();
        }
        //character selection
        if(choice.equalsIgnoreCase("hero"))
        {
            System.out.println("List of Heroes ");
            for(int i=0;i<4;i++)
            {
                System.out.print(heroes[i]+" ");
            }
            System.out.println();
            try
            {
                // Delay for 1 seonds
                Thread.sleep(1000);   
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println("Do you want to choose your character or will the computer do it for you? write yes to choose or no for random generation");
            String choice1=sc.nextLine();
            System.out.println();
            if(choice1.equalsIgnoreCase("yes"))
            {
                // user character selection
                System.out.println("Which Character do you choose ?");
                heroBot=sc.nextLine();
                System.out.println();
            }
            else
            {
                //random character selection for user
                Random r=new Random();        
                int heronum =r.nextInt(heroes.length);
                heroBot=heroes[heronum];
                System.out.print("Your character is : ");
                try
                {
                    // Delay for 1 seonds
                    Thread.sleep(1000);   
                }
                catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }
                System.out.println(heroes[heronum]);
                System.out.println();
            }
            //random selection of opponent
            Random r=new Random();        
            int villainnum =r.nextInt(villains.length);
            villainBot=villains[villainnum];
            System.out.print("Your opponent is : "); 
            try
            {
                // Delay for 1 seonds
                Thread.sleep(1000);   
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println(villainBot);
            System.out.println();
        }
        if(choice.equalsIgnoreCase("villain"))
        {
            System.out.println("List of Villains");
            for(int i=0;i<3;i++)
            {
                System.out.print(villains[i]+" ");
            }
            System.out.println();
            try
            {
                // Delay for 1 seonds
                Thread.sleep(1000);   
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println("Do you want to choose your character or will the computer do it for you? write yes to choose or no for random generation");
            String choice1=sc.nextLine();
            System.out.println();
            if(choice1.equalsIgnoreCase("yes"))
            {
                try
                {
                    // Delay for 1 seonds
                    Thread.sleep(1000);   
                }
                catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }
                //user selection for antagonist character
                System.out.println("Which Character do you choose ?");
                villainBot=sc.nextLine();
                System.out.println();
            }
            else
            {
                //random selection of antagonist character
                Random r=new Random();        
                int villainnum =r.nextInt(villains.length);
                villainBot=villains[villainnum];
                System.out.print("Your character is : ");
                try
                {
                    // Delay for 2 seonds
                    Thread.sleep(2000);   
                }
                catch(InterruptedException ex)
                {
                    ex.printStackTrace();
                }
                System.out.println(villainBot);
                System.out.println();
            }
            //random selection of opponent
            Random r=new Random();        
            int heronum =r.nextInt(heroes.length);
            heroBot=heroes[heronum];
            System.out.print("Your opponent is : ");
            try
            {
                // Delay for 2 seonds
                Thread.sleep(2000);   
            }
            catch(InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println(heroes[heronum]);
            System.out.println();
        }
    }

    public void getPowers()
    {
        // the moves of the characters
        hercules=new String[]{"Arrow shots","club strike","heal","face punch"};
        pikachu=new String[]{"thunder shock","tail slap","pika block","heal"};
        jedi=new String[]{"attack","lightsaber slash","force whirlwind","heal"};
        medusa=new String[]{"claw slice","snake bite","stone attack","heal"};
        azazel=new String[]{"Heal","Sword slice","Paralyzation","killer frequency"};
        lilith=new String[]{"Energy rays","Invulnerability","Heal","Pyrokinesis"};
    }

    public String PikachuStrengths()
    {
        String strength=""; 
        //choice of move for the user if they choose to be hero pikachu
        if(choice.equalsIgnoreCase("hero"))
        {
            System.out.println();
            System.out.println("Choose your Move :");
            for(int i=0;i<4;i++)
                System.out.println(pikachu[i]);
            strength=sc.nextLine();
            System.out.println();
        }
        else
        //random choice of move if pikachu is the opponent
        {
            System.out.println();
            Random r=new Random();        
            int strengthnum =r.nextInt(pikachu.length);
            strength=pikachu[strengthnum]; 
            System.out.println();
        }
        return(strength);
    }

    public String herculesStrength()
    {
        String strength=""; 
        System.out.println();
        // user input choice of move
        if(choice.equalsIgnoreCase("hero"))
        {
            System.out.println("Choose your move :");
            for(int i=0;i<4;i++)
                System.out.println(hercules[i]);
            strength=sc.nextLine();
        }
        else
        //random move generated if hercules is the opponent
        {
            Random r=new Random();        
            int strengthnum =r.nextInt(hercules.length);
            strength=hercules[strengthnum]; 
        }
        System.out.println();
        return(strength);        
    }

    public String JediStrength()
    {
        String strength="";
        System.out.println();
        if(choice.equalsIgnoreCase("hero"))
        {
            //user input choice of move if the user is jedi
            System.out.println("Choose your move : :");
            for(int i=0;i<4;i++)
                System.out.println(jedi[i]);
            strength=sc.nextLine();
        }
        else
        {
            //random generated move if jedi is the opponet
            Random r=new Random();        
            int strengthnum =r.nextInt(jedi.length);
            strength=jedi[strengthnum]; 
        }
        System.out.println();
        return(strength); 
    }

    public String AzazelStrength()
    {
        String strength=""; 
        System.out.println();
        if(choice.equalsIgnoreCase("villain"))
        {
            //user input move if user id azazel
            System.out.println("Choose your move :");
            for(int i=0;i<4;i++)
                System.out.println(azazel[i]);
            strength=sc.nextLine();
        }
        else
        {
            //random generated move if azazel is the opponent
            Random r=new Random();        
            int strengthnum =r.nextInt(azazel.length);
            strength=azazel[strengthnum]; 
        }
        System.out.println();
        return(strength);   
    }

    public String LilithStrength()
    {
        String strength=""; 
        System.out.println();
        if(choice.equalsIgnoreCase("villain"))
        {
            //user input choice of move if the user is lilith
            System.out.println("Choose your move :");
            for(int i=0;i<4;i++)
                System.out.println(lilith[i]);
            strength=sc.nextLine();
        }
        else
        {
            // random generated move if lilith is the opponent
            Random r=new Random();        
            int strengthnum =r.nextInt(lilith.length);
            strength=lilith[strengthnum]; 
        }
        System.out.println();
        return(strength);
    }

    public String MedusaStrength()
    {
        String strength=""; 
        System.out.println();
        if(choice.equalsIgnoreCase("villain"))
        {
            //user input choice of move if the user is medusa
            System.out.println("Choose your move :");
            for(int i=0;i<4;i++)
                System.out.println(medusa[i]);
            strength=sc.nextLine();
        }
        else
        {
            //random generated move if medusa is the opponent
            Random r=new Random();        
            int strengthnum =r.nextInt(medusa.length);
            strength=medusa[strengthnum]; 
        }
        System.out.println();
        return(strength);  
    }

    public String play()
    {
        // calling the respective character functions to get the desired output
        String outcome="";
        while(true)
        {
            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;
            String move="";
            if(heroBot.equalsIgnoreCase("pikachu"))
            {
                if(choice.equalsIgnoreCase("hero"))
                {
                    try
                    {
                        // Delay for 1 seonds
                        Thread.sleep(1000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.println("Your turn");
                    move=PikachuStrengths();
                    // f the user chooses the move
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Hhealth);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops you missed "+villainBot);
                        System.out.println("Your health : "+Hhealth);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
                else
                { 
                    // if the move is random generated
                    System.out.println("Pikachu's turn ");
                    move=PikachuStrengths();
                    try
                    {
                        // Delay for 2 seonds
                        Thread.sleep(2000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.println("Pikachu chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Pikachu's health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println(heroBot+"'s health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("Pikachu did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops Pikachu missed "+villainBot);
                        System.out.println("Pikachu's health : "+Hhealth);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
            }

            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;

            if(heroBot.equalsIgnoreCase("jedi"))
            {
                if(choice.equalsIgnoreCase("hero"))
                {
                    //if the user chooses the move
                    System.out.println("Your turn ");
                    move=JediStrength();
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 2 seonds
                            Thread.sleep(2000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops you missed "+villainBot);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
                else
                { 
                    //if the move is random generated
                    System.out.println("Jedi's turn ");  
                    move=JediStrength();
                    try
                    {
                        // Delay for 2 seonds
                        Thread.sleep(2000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.println("Jedi chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Jedi's health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Jedi's health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("Jedi did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops Jedi missed "+villainBot);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Jedi's health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
            }

            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;

            if(heroBot.equalsIgnoreCase("hercules"))
            {
                if(choice.equalsIgnoreCase("hero"))
                {
                    System.out.println("Your turn  ");
                    //if user chooses the move
                    move=herculesStrength();
                    try
                    {
                        // Delay for 1 seonds
                        Thread.sleep(1000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        System.out.println("Your health increased by "+health[healthnum]); 
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops you missed "+villainBot);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
                else
                {
                    //if the move is random generated
                    System.out.println("Hercules Turn : ");
                    move=herculesStrength();
                    try
                    {
                        // Delay for 1 seonds
                        Thread.sleep(1000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    System.out.println("Hercules chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Hhealth+=health[healthnum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Hercules's health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Hercules's health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Vhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("Hercules did "+damage[attacknum]+" damage to "+villainBot);
                        else
                            System.out.println("Oops Hercules missed "+villainBot);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Hercules's health : "+Hhealth);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                    }
                }
            }

            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;

            if(villainBot.equalsIgnoreCase("medusa"))
            {
                if(choice.equalsIgnoreCase("villain"))
                {
                    //if the ove is choosen by the user
                    System.out.println("Your Turn : ");
                    move=MedusaStrength();
                    try
                    {
                        // Delay for 1 seonds
                        Thread.sleep(1000);   
                    }
                    catch(InterruptedException ex)
                    {
                        ex.printStackTrace();
                    }
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Your health increased by "+health[healthnum]);
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        try
                        {
                            // Delay for 1 seonds
                            Thread.sleep(1000);   
                        }
                        catch(InterruptedException ex)
                        {
                            ex.printStackTrace();
                        }
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops you missed "+heroBot);
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
                else
                {
                    // if the move is random generated
                    System.out.println("Medusa's Turn : ");
                    move=MedusaStrength();
                    System.out.println("Medusa chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Your health increased by "+health[healthnum]);
                        System.out.println("Medusa's health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        if(damage[attacknum]!=0)
                            System.out.println("Medusa did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops Medusa missed "+heroBot);
                        System.out.println("Medusa's health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
            }

            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;

            if(villainBot.equalsIgnoreCase("lilith"))
            {
                if(choice.equalsIgnoreCase("villain"))
                {
                    //if move is choosen by user
                    System.out.println("Your Turn : ");
                    move=LilithStrength();
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Your health increased by "+health[healthnum]);
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops you missed "+heroBot);
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
                else
                {
                    //if the move is random generated
                    System.out.println("Lilith's Turn : ");  
                    move=LilithStrength();
                    System.out.println("Lilith chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Lilith's health increased by "+health[healthnum]);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        if(damage[attacknum]!=0)
                            System.out.println("Lilith did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops Lilith missed "+heroBot);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
            }

            if(Vhealth<=0)
            // if the life of the villain ends
                break;
            if(Hhealth<=0)
            // if all the life of the hero is used up
                break;

            if(villainBot.equalsIgnoreCase("azazel"))
            {
                if(choice.equalsIgnoreCase("villain"))
                {
                    //if the user chooses the move
                    System.out.println("Your Turn : ");
                    move=AzazelStrength();
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Your health increased by "+health[healthnum]);
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops you missed "+heroBot);
                        System.out.println("Your health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
                else
                {
                    System.out.println("Azazel's Turn ");
                    // if the move is random generated
                    move=AzazelStrength();
                    System.out.println("Azazel chose "+move);
                    if(move.equalsIgnoreCase("heal"))
                    {
                        Random r=new Random();        
                        int healthnum =r.nextInt(health.length);
                        Vhealth+=health[healthnum];
                        System.out.println("Azazel's health increased by "+health[healthnum]);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                    else
                    {
                        Random r=new Random();        
                        int attacknum =r.nextInt(damage.length);
                        Hhealth-=damage[attacknum];
                        if(damage[attacknum]!=0)
                            System.out.println("You did "+damage[attacknum]+" damage to "+heroBot);
                        else
                            System.out.println("Oops Azazel missed "+heroBot);
                        System.out.println(villainBot+"'s health : "+Vhealth);
                        System.out.println(heroBot+"'s health : "+Hhealth);
                    }
                }
            }
            System.out.println();
        }
        if(choice.equalsIgnoreCase("hero"))
        {
            if(Vhealth>Hhealth)
                outcome="lose";
            else if(Hhealth>Vhealth)
                outcome="win";
            else
                outcome="draw";
        }
        else
        {
            if(Hhealth>Vhealth)
                outcome="lose";
            else if(Vhealth>Hhealth)
                outcome="win";
            else
                outcome="draw";
        }
        return (outcome);
    }

    public void display()
    { 
        System.out.println();
        String outcome=play();
        if(outcome.equalsIgnoreCase("win"))
            System.out.println("Congratulations !!! You have won !!!");
        else if (outcome.equalsIgnoreCase("lose"))
            System.out.println("You Have Lost! Better luck next time !");
        else
            System.out.println("Its a Draw!");
    }

    public static void main(String[]args)
    {
        game ob=new game();
        ob.getData();
        ob.getPowers();
        ob.display();
    }
}