package Lab03Teil2;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        // Aufgabe 6: Text-Adventure
        // Erstelle ein Text-Adventure: Es wird dem User eine Geschichte angezeigt, wo er mit der Eingabe von 1,2 oder 3
        // entscheiden kann wie es weiter geht. Programmiere so eine Geschichte mit mindestens 2 Usereingaben mit jeweils 3 möglichen Wegen.
        // Bevor du zu programmieren beginnst, erstelle ein Ablaufdiagramm für dein Adventure.

        System.out.println("Welcome to Philosophy!\n");

        System.out.println("""
                In Philosophy the most important part is not to memorize what the past Philosophers said,
                but to learn how to think, especially how to think critically.
                
                Should I continue? (1),
                Change the topic? (2) or
                Tell you why I programmed this text adventure? (3)
                """);

        System.out.println("Enter: ");

        Scanner input = new Scanner(System.in);
        char ans = input.next().charAt(0);

        if (ans == '1') {
            System.out.println("""
                    To think like a philosopher, you need to listen to all views and follow the best. 
                    The best doesn't necessarily mean the most loud voice. It shouldn't let you believe that the person who tells it, should be an expert in his/her field.
                    The criterion to weigh the most truthful opinion is to test it with scientific methods as well as with reasoning!
                    
                    Should I continue? (1),
                    Change the topic? (2) or
                    Tell you why I programmed this text adventure? (3)
                    """);
            ans = input.next().charAt(0);
            if (ans == '1') {
                System.out.println("""
                        Throughout history, people believed to religions. There's not even a single nation in the world, 
                        that didn't believe in a higher power. There might be some individuals who questioned the dogmas of their 
                        birth place, but mostly people followed the footsteps of their ancestors blindly.
                        
                        Should I continue? (1),
                        Change the topic? (2) or
                        Tell you why I programmed this text adventure? (3)
                        """);
                ans = input.next().charAt(0);

                if (ans == '1') {
                    System.out.println("""
                            The Prophets, whom I consider as the biggest philosophers, always questioned the dogmas and 
                            for the most part, destroyed all the idols both physical ones as well as the abstract ones of their societies. 
                            
                            Should I continue? (1),
                            Change the topic? (2) or
                            Tell you why I programmed this text adventure? (3)
                            """);
                    ans = input.next().charAt(0);
                    if (ans == '1') {
                        System.out.println("""
                        Can you guess what today's idols are?
                        
                        Should I continue? (1),
                        Change the topic? (2) or
                        Tell you why I programmed this text adventure? (3)
                        """);

                        ans = input.next().charAt(0);

                        if (ans == '1') {
                            System.out.println("""
                                    The list of 21st century's idols is long. To give an example, someone who doesn't promote LGBTQ+ propaganda, 
                                    is considered by the majority as a bigot, inhumane, retarded and primitive person. This is something we should really think about.
                                    I'm not against people who have different sexual orientation, but the propaganda. This is something which I can't tolerate. 
                                    Now, I no longer want to continue! That's all folks :D
                                    
                                    Move to the next topic (2)
                                    Tell me why you programmed this text adventure? (3)  
                                    """);
                            ans = input.next().charAt(0);
                            if (ans == '2') {

                            }
                        }
                    }
                }
            }
        }
        if (ans == '2') {
            System.out.println("""
                        Now I want to change the topic to "Why I decided to study Computer Science".
                        
                        Should I continue? (1),
                        Change the topic? (2) or
                        Tell you why I programmed this text adventure? (3)
                        """);
            ans = input.next().charAt(0);
            if (ans == '1') {
                System.out.println("""
                        Since my childhood I was interested in computers. So this lead me to start learning programming
                        from an early age. As far as I can remember, I started to learn programming at the age of 8. Thus, my father
                        encouraged me to study Computer Science.
                        
                        Should I continue? (1),
                        Change the topic? (2) or
                        Tell you why I programmed this text adventure? (3)
                        """);
                ans = input.next().charAt(0);
                if (ans == '1') {
                    System.out.println("""
                            My plan for 2023 is, to spend my summer holidays to learn Java comprehensively, so that I can
                            find a job as a Java developer as soon as possible.
                            I'm out of words :) 
                            
                            Change the topic? (2) or
                            Should I tell you why I programmed this text adventure? (3)
                            """);
                    ans = input.next().charAt(0);
                    if (ans == '1') {
                        System.out.println("You typed the wrong number!");
                    }
                }
            }

            if (ans == '2') {
                System.out.println("""
                        Since you decided to change the topic twice, I presume you just want to test my programming skills.
                        To be honest, I would have done the same thing. Since the more you test me, the clearer you will have an image of me!
                        That's what I actually appreciate.
                        
                        Should I continue? (1),
                        Should I change the topic? (2)
                        Should I tell you the reason why I programmed this text adventure? (3)
                        """);
                ans = input.next().charAt(0);
                if (ans == '1') {
                    System.out.println("""
                            I'm out of words I'm sorry :D
                            
                            Should I change the topic? (2)
                            Should I tell you the reason why I programmed this text adventure? (3)
                            """);
                    ans = input.next().charAt(0);
                }
                if (ans == '2') {
                    System.out.println("""
                            I no longer want to change the topic.
                            
                            Should I tell you the reason why I programmed this text adventure? (3)
                            """);
                    ans = input.next().charAt(0);
                }
            }
        }
        if (ans == '3') {
            System.out.println("""
                            The reason why I programmed this text adventure is because, I want to improve my programming skills!.
                            """);
        }
        System.out.println("The text story reached its end!");
        input.close();
    }
}
