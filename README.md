# One-Dimensional Java array activity
This is an activity to practice one-dimensional array programming. It consists of creating a battery that charges and discharges depending on the values entered

> **<h4>Rules</h4>**
> 
> &check; The system has a peculiar HW design, consisting of a 10-cell battery.
>
> &check; The energy cells can contain different values of energy units, always numerical.
> 
> &check; The computer allows us to write on the screen but, every time we write a character, it consumes a certain value of energy depending on what we write
> 

### Project state
| Today's code  | To update |
| ------------- | ------------- |
|  <ul><li>[x] Almost everything works</li><li>[x] Simple</li><li>[x] Interactive</li><li>[x] Can be improved</li></ul>  | <li>[ ] More user-friendly</li><li>[ ] improve the fourth option</li><li>[ ] Not definitive</li><li>[ ] Not perfect</li>  |

# Project Intent
You have to create a menu with five options;

1. Empty battery

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The system will ask us if we are sure that we want to empty the battery. If you say "yes", the program will proceed to leave all the cells at &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;0.

2. Battery charge

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The system charges the battery so that in each of the energy cells it puts a value between 0 and 2. This value will be calculated randomly. 
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Values between 0 and 2 are the load units of each of the cells. In the event that the battery has power, before initializing it, it will ask if we &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;want to carry out the process. The possible answers will be “Y” or “N”.
Once loaded, the system will show us the total energy units and the &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;average.

3. Print battery power

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The system will print the battery but taking into account that when a cell has 0 units of charge it will print "-", when it is worth one unit it &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;will print "+" and when it is worth two units it will print "*".

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-  ```0 = -```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-  ```1 = +```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-  ```2 = *```

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Example:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;“``` 0 2 1 2 2 1 0 1 2 1 ```”

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;“```- * + * * + - + * +```”

4. Write [ n ] characters

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;The system will initially ask us how many characters we want to write. Every time we write a character, the system consumes certain &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;battery units. The characters have a cost to be printed on the screen, which can be seen in the following table.

<div align = "center">
 
| Character type  | Units consumed |
| -------------   | :-------------:|
| Numbers         |       1        |
| Vowels          |       2        |
| Consonants      |       3        |

</div>

5. Show Stats

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;It should print how many numbers, vowels and consonants have been entered and how many energy units have been consumed.



#
>Contributions, issues, and feature requests are welcome!
>Give a ⭐️ if you like this project!
