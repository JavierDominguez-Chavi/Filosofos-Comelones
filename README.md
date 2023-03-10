# Filosofos-Comelones
Solución al problema "Filósofos Comelones" mediante el manejo de hilos en Java
>En una mesa redonda se sientan 5 filósofos, al centro de la mesa hay un tazón mágico de espagueti (el espagueti nunca se termina)

>Lo único que hacen los filósofos es comer y pensar (no pueden hacer las dos cosas al mismo tiempo)

>Para poder comer, cada filósofo necesita de 2 tenedores: un tenedor izquierdo y uno derecho. En total hay 5 tenedores en la mesa

>Como es una mesa redonda, algunos de los tenedores son compartidos. Por ejemplo: el tenedor izquierdo del  filósofo 1 es el derecho del filósofo 5, mientras que el tenedor derecho del  filósofo 1 es el tener izquierdo del  filósofo 2

> Los recursos compartidos son los tenedores (2 por filósofo)

> Si dos filósofos adyacentes desean comer al mismo tiempo puede generarse una condición de carrera (se compite por los tenedores)

> Es necesario asegurar que eventualmente todos los filósofos que desean comer lo hagan

> Es necesario evitar dead-locks
