# Deitel Java How to Program - Exercises (Chapters 2 and 3)

```
exercises/
├── README.md
└── src/
    ├── chapter2/    package chapter2  -> Exercise2_01 ... Exercise2_35
    └── chapter3/    package chapter3  -> Exercise3_01 ... Exercise3_10,
                                          then class pairs for 3.11 - 3.17, plus the GUI exercise
```

Every file starts with `package chapter2;` or `package chapter3;`.
Written (non-code) answers live in comments and are printed by `main`, so you can run them too.

## How to run

**IntelliJ IDEA / Eclipse:** open the `exercises` folder as a project, mark `src` as the
Sources Root, then right-click any class with `main` and choose Run.

**Command line** (from inside the `exercises` folder):

```
javac -d out src/chapter2/*.java src/chapter3/*.java
java -cp out chapter2.Exercise2_06
java -cp out chapter3.InvoiceTest
```

Programs that use `Scanner` wait for you to type input in the console.

## Chapter 2 index

| Exercise | Class | Kind |
|---|---|---|
| 2.1 | Exercise2_01 | Written: fill in the blanks |
| 2.2 | Exercise2_02 | Written: true/false |
| 2.3 | Exercise2_03 | Code: statements |
| 2.4 | Exercise2_04 | Code: find and fix errors |
| 2.5 | Exercise2_05 | Written: statements for 2.6 |
| 2.6 | Exercise2_06 | Code: product of three integers |
| 2.7 | Exercise2_07 | Written: fill in the blanks |
| 2.8 | Exercise2_08 | Code: statements |
| 2.9 | Exercise2_09 | Written: true/false |
| 2.10 | Exercise2_10 | Code: printf output |
| 2.11 | Exercise2_11 | Written: which variables change |
| 2.12 | Exercise2_12 | Code: equivalent expressions |
| 2.13 | Exercise2_13 | Code: order of evaluation |
| 2.14 | Exercise2_14 | Code: 1 2 3 4 three ways |
| 2.15 | Exercise2_15 | Code: arithmetic |
| 2.16 | Exercise2_16 | Code: comparing integers |
| 2.17 | Exercise2_17 | Code: sum, average, product, smallest, largest |
| 2.18 | Exercise2_18 | Code: shapes with asterisks |
| 2.19 - 2.23 | Exercise2_19 ... Exercise2_23 | Code: what does it print? |
| 2.24 | Exercise2_24 | Code: largest and smallest of five |
| 2.25 | Exercise2_25 | Code: odd or even |
| 2.26 | Exercise2_26 | Code: multiples |
| 2.27 | Exercise2_27 | Code: checkerboard |
| 2.28 | Exercise2_28 | Code: circle |
| 2.29 | Exercise2_29 | Code: character values |
| 2.30 | Exercise2_30 | Code: separate digits |
| 2.31 | Exercise2_31 | Code: squares and cubes table |
| 2.32 | Exercise2_32 | Code: negative, positive, zero |
| 2.33 | Exercise2_33 | Code: BMI calculator |
| 2.34 | Exercise2_34 | Code: population growth |
| 2.35 | Exercise2_35 | Code: car-pool savings |

## Chapter 3 index

| Exercise | Classes | Kind |
|---|---|---|
| 3.1 | Exercise3_01 | Written: fill in the blanks |
| 3.2 | Exercise3_02 | Written: true/false |
| 3.3 | Exercise3_03 | Written + demo: local variable vs. field |
| 3.4 | Exercise3_04 | Written + demo: parameter vs. argument |
| 3.5 | Exercise3_05 | Written: keyword new |
| 3.6 | Exercise3_06 | Written + demo: default constructors |
| 3.7 | Exercise3_07 | Written + demo: instance variables |
| 3.8 | Exercise3_08 | Written: why System and String need no import |
| 3.9 | Exercise3_09 | Written + demo: Scanner without import |
| 3.10 | Exercise3_10 | Written + demo: set and get methods |
| 3.11 | GradeBook, GradeBookTest | Code: modified GradeBook |
| 3.12 | Account, AccountTest | Code: debit method |
| 3.13 | Invoice, InvoiceTest | Code: Invoice class |
| 3.14 | Employee, EmployeeTest | Code: Employee class |
| 3.15 | Date, DateTest | Code: Date class |
| 3.16 | HeartRates, HeartRatesTest | Code: target heart rate |
| 3.17 | HealthProfile, HealthProfileTest | Code: health profile |
| GUI 3.1 | GuiExercise3_1 | Code: addition with JOptionPane (needs a desktop to display) |
