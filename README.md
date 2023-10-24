# FootballCareer
## Turniere
### Weltmeisterschaft
Alle 4 Saisons (saison == 4 || saison == 8 || saison == 12 || saison == 16 || saison == 20) gibt es ein Turnier welches entscheidet wer die WM gewinnt. Alle Länder spielen.

### Europameisterschaft
Alle 4 Saisons (saison == 2 || saison == 6 || saison == 10 || saison == 14 || saison == 18) gibt es ein Turnier welches entscheidet wer die EM gewinnt. Nur europäische Länder spielen.

### Copa America
Random Saison gibt es ein Turnier welches entscheidet wer die Copa gewinnt. Es dürfen nur Südamerikanische Länder mitspielen.


## Statistiken
* Die Statisktien sollen zeigen wo man zur Zeit spielt, aus welchem Land man kommt und auf welcher Position man spielt.

* Ausgabe soll wie folgt aussehen


````
Stats

Club: Random
Nation: Random
Position: Random
````


## Club

* Je nach Position wird dann die Saison die Vorlagen und dann Tore oder Cleansheets ausgeben.

* Saison werden selbst bestimmt oder durch eine Frage an den User. (Standard ist 20)

* Die Ausgabe die unten angezeigt wird ist nur die Ausgabe für die Sturm und Mittelfeld-Spieler.

````
Saison 1:
Vorlagen: Random
Tore: Random
````

## Wechseln

* Es soll eine Möglichkeit geben Klubs zu wechseln. In dem als erstes gefragt wird ob man auf die Transferliste will und dann bekommt man vielleicht ein Angebot eines Klubes.


````
Möchtest du auf die Transferliste gesetzt werden : Ja(1)  Nein(2)

Ja

Angebot von Newcastle United

Möchtest du zu dem Verein wechseln : Ja(1)  Nein(2)
````


* Man soll die Fragen als Zahl also in dem Fall 1 und 2, aber auch mit Wörtern beantworten können


## Ende

* Am Ende der Karriere soll man alle Tore, Vorlagen, Cleansheets und Trophäen sehen die ein Spieler gewonnen hat. Man kann es auch erweitern in dem man anzeigt was gewonnen wurde wie z.B. Champions League, FA Cup.. .


* **Aufpassen bei der Erweiterung muss man aufpassen in welchem Land der Spieler spielt, da die Trophäen überall einen anderen Namen haben.**

# Aufforderung

* Objektoriertiert arbeiten, damit es kein langes main wird.

| Klassennamen  | Klassenzweck  |
| ------------- | ------------- |
| World Cup     | Die Weltmeisterschaft ausgeben und Tropäenvergabe  |
| Euro Cup      | Die Europameisterschaft ausgeben und Tropäenvergabe  |
| Copa Cup      | Die Copa-America ausgeben und Tropäenvergabe  |
| Print      | Soll die Statistiken, das Karriereende und die Wechselmöglichkeiten ausgeben |

## Einlesen von Dateien

* Erstelle ein txt Datei mit dem namen nations und schreibe mindestens 50 Länder hinein. Lese diese dann ein für dein Array welches dem Spieler seine Nation gibt.
* Man kann auch mehrere Dateien erstellen die in Kontinenten geordnet sind, damit es leichter ist für die Turniere.

IMPORTANT: Erstellen Sie eine Methode `countLines(...)`, die die Zeilen einer Datei ermittelt, um das String-Array korrekt dimensionieren zu können.

# Erweiterung **Nicht verpflichtend**

* Wenn man will kann man ein Managermodus nach dem Karrieremodus erstellen, der den Spieler nochmal in die Fußballwelt versetzt.

````
____   ____.__       .__      _________                          ._.
\   \ /   /|__| ____ |  |    /   _____/__________    ______ _____| |
 \   Y   / |  |/ __ \|  |    \_____  \\____ \__  \  /  ___//  ___/ |
  \     /  |  \  ___/|  |__  /        \  |_> > __ \_\___ \ \___ \ \|
   \___/   |__|\___  >____/ /_______  /   __(____  /____  >____  >__
                   \/               \/|__|       \/     \/     \/ \/
````