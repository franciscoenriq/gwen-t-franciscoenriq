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
-------------------------------------------------------------------------------
ENTREGAPARCIAL 3 : 
Agregué el double dispatch para poder dejar una carta en el campo de batalla , a travez de la funcion 
play alojada en abstractPlayer, de esta manera usando esta unica fucion es posible que el usuraio 
coloque correctamente la carta donde corresponda, ya que se usa la carta jugada para 
ir a un metodo dentro de la clase de la carta que finalemnte nos redijirá a la funcion auxiliar requerida 
dentro de AbstractPlayer para poder colocar la carta correctamente donde corresponda. 
Eso si me quedó la duda de como implementar el tablero en si , ya que no se si es necesario crear 
un arreglo de clases de tableros o que simplemente estas clases queden en el aire por 
decirlo de alguna manera. Para esta entrega quedaron al aire las clases aunque quedo 
una variable (tablero) que hacia referencia a la primera idea nombrada la cual al final no se termina usando. 
Los tests no alcancé a a hacerlos :( 
----------------------------------------
Alcancé a a dejar mejor mi entrega , al final lo que hice fue crear la clase tablero, la cual al inicializarse 
contiene variables de todos los campos del tablero . La idea entonces es que a cada jugador se le entregue el mismo 
tablero , de esta manera ambos estarán enterados de cualquier carta de que se coloque en el tablero. 
Así tambien resolvemos el hecho de tener solo una zona de clima. 
Lo demas termina funcionande excatamente igual a lo explicado anteriormente. 
NUevamente no alcancé a hacer los tests : (( 
------------------------------------------
ENTREGA FINAL TAREA 2: Dejaré el metodo setGemCount como publico pero en teoría deberia ser privado 
dada la caracteristica de la variable que setea el setter. Esto es debido a que es necesario para testear. 
Las listas de AbstractPlayer cambiaran el tipo que almacenan, ya que se le agregó un trait a las cartas, las listas seran del tipo 
arraybuffer[Cards].
Se implementa de buena manera el doubleDispatch necesario para colocar cartas en el tablero , los tests pasan . 
A parte de esto, se agregan los setters y getters correspondientes para cada clase . 
Para las clases del tablero se agregó un seter el cual nos indica la posicion de una cierta carta agregada a la lista de 
las cartas de esta zona. 


