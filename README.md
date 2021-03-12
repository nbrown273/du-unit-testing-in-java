# Unit Testing in Java for DU

This project provides examples and exercises for the revamped DU Unit Testing
course in Java. Primary learning objects are:

1. What is a unit test?
    * Components of a Test
    * Components of Testing Frameworks
    * Types of Tests
2. What is a good unit test?
    * Properties of a Good Test
    * Identifying What to Test
    * Test Driven Development
    * KISS and DRY
3. Dealing with dependencies
    * Assertion Categories
    * Fakes, Mocks, and Stubs
    * Dependency Injection
    * Isolation Frameworks

For a two hour course this is a lot; however, it's not expected for a new programmer to walk away
with each section equally developed. Your takeaway from these learning objectives should be:

1. The ability to build tests in Java
2. Know how to measure improvement and the value of your delivery, in testing
3. Gain awareness of several subject areas you can work on improving next

## Table of Contents

* [Dependencies](#dependencies)
* [Running the Tests](#running-the-tests)
* [How to Score Bowling](#how-to-score-bowling)
* [Exercises](#exercises)

## Dependencies
What you need:
* Git CLI and an optional client: [Git](https://git-scm.com/downloads)
* IDE suitable for Java development with Maven: [IntelliJ](https://www.jetbrains.com/idea/download/)

## Running the Tests
The precise menus/shortcuts you use will depend on the IDE. For IntelliJ, there
are several options:
* Right Click Project Folder \
  -> Run 'All Tests'
* Keyboard ShortCut: *Ctrl + Shift + F10*
* Open Test Class \
  -> Press Green Play Icon Next to Class/Test Method Declarations
* Open Run Window \
  -> Toggle Auto-Test to 'ON' \
  -> Open File->Settings->Compiler \
  -> Check 'Build Project Automatically'
  -> Modify any 'src' file

## Kata: Scoring a Game of Bowling
For the concreat practice portion of each unit you will be (partially) completing a common testing Kata:
scoring a game of bowling. You can choose to design your classes and tests however you see fit
as long as the goal in the next section is met.

This set of exercises is considered a Kata because, like a martial arts kata, it is a great tool
to reuse for learning different aspects of a discipline and encorporating them into a bigger picture.
Want to practice TDD? Maybe work on class design principles, DRY, or KISS? Maybe you just need to ramp up in a new
language or testing framework. Coming back to this Kata (or others) and focusing on the specific
area of interest is a good way to practice. Each time you repeat the kata with a different
focus you will often end up with wildly different solutions.

I suggest the following "focuses" for each unit:
1. What is a test? **Unfocused**
2. What is a good test? **TDD**
3. Dealing with dependencies **Your choice**
    * *Note*: This is a good opportunity to practice anything from unit 1 or 2 or, if you feel ready, focus on a
    dependency topic by adding configuration, logging, IOT, or other peripherals to the base kata.

### Exercises
The goal of these exercises is to write one or more utilities that can score a game of bowling.
How you represent the game and design the utility is up to you; however, your scoring utility
must pass at least all the following scenarios and have supporting unit tests to validate this.

1. A gutter game
2. A game of all ones
3. A game with one spare and all other frames less than ten.
4. A game with one strike and all other frames less than ten.
5. A perfect game (12 strikes)

### How to Score Bowling
The game consists of 10 frames.  In each frame the player has
up to two opportunities to knock down 10 pins.  The score for the frame is the total
number of pins knocked down, plus bonuses for strikes and spares.

A spare is when the player knocks down all 10 pins in two tries.  The bonus for
that frame is the number of pins knocked down by the next roll. This is usually
in the next frame, unless it is the last frame of the game

A strike is when the player knocks down all 10 pins on his first try.  The bonus
for that frame is the value of the next two balls rolled, regardless of which frame
they are rolled in (next frame, next two frames, or the same frame in the case of the
tenth frame)

In the tenth frame a player who rolls a spare or strike is allowed to roll extra
balls as needed to complete the frame.  If a spare is made with the first two rolls,
one extra ball is rolled. If a strike is made on the first roll, two extra balls are
rolled. Anytime all ten pins are knocked down and additional rolls are still needed,
the pins are reset.