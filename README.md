# Gwen't

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/)

Context
-------

This project's goal is to create a (simplified) clone of the
[_Gwent_](https://www.playgwent.com/en)card game developed by [_CD PROJEKT RED_](https://cdprojektred.com/en/)

---

**The rest of the documentation is left for the users of this template to complete**
Readme: 
Para esta entrega implementé de forma general la estructura en que las clases van a interactuar entre ellas. 
De esta manera se construyen 3 carpetas en las cuales se empezaran a añadir las clases, una para el tablero , otra para las cartas y finalmente
una para los jugadores. 
Para las cartas fue un poco engorrozo ya que existen bastantes clases pero traté de separarlas teniendo un sentido de tras de 
esto . 
Abstract Card es la clase padre de todas las clases , de aca existe climate card que ya es una implemtacion concreta de carta y 
abstractUnitCard de la cual finalmente se derivan las cartas de unidad , de esta manera nos aseguramos que para carta de unidad 
al por ejemplo usar el poder (que se impementará mas adelante) se pueda hacer double dispatch de buena manera. 
Hay que mencionar que crepe un metodo en abstractCard llamado addCard el cual añade la carta en cuestion a 
un mazo de cartas , el cual se pasa como parametro del metodo. 
Para los jugadores se implementa una interfaz la cual la usan AbstractPlayer , de aca se deriva cpuPlayer y userPlayer, 
esto es debido a que la forma en se va desarrollando la implementacion de turnos cambia para ambos , sobre todo para 
cpuPlayer.
En cuanto a los tests no alcancé a hacerlos todos pero creo que tengo un buen coverage de estos :(( 


