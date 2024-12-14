# Model-Aufbau
EMF wird verwendet um das Model auszulesen. Es wird in einer XML-Datei gespeichert. Ein Beispiel ist hier gezeigt.

```
<?xml version="1.0" encoding="UTF-8"?>
<de.otpiccolo.dsa5.model.pdf:Pdf xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:de.otpiccolo.dsa5.model.pdf="http:///de/otpiccolo/dsa5/model/pdf.ecore" xmlns:de.otpiccolo.dsa5.model.pdf.content="http:///de/otpiccolo/dsa5/model/pdf/content.ecore" xmlns:de.otpiccolo.dsa5.model.pdf.page="http:///de/otpiccolo/dsa5/model/pdf/page.ecore">
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Altersresistenz (*)" contentType="Vorteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Beidhändig" contentType="Vorteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Kälteresistenz" contentType="Vorteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Verbesserte Regeneration (Astralenergie) I-III" contentType="Vorteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Waffenbegabung" contentType="Vorteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Hitzeempfindlich" contentType="Nachteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Verpflichtungen I-III" contentType="Nachteil"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Zauberanfällig I-II" contentType="Nachteil"/>
    <title>Vorteile &amp; Nachteile</title>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Balsam Salabunde" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Blick in die Gedanken" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Harmlose Gestalt" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Hexenknoten" contentType="Zauber"/>
    <title>Zaubersprüche</title>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Hagelschlag" contentType="Hexenfluch"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Katzenaugen" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Krötensprung" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Odem Arcanum" contentType="Zauber"/>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:DataContent" content="Tiergedanken" contentType="Zauber"/>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
      <title>Überschift Paragraph 1</title>
      <paragraphs>Paragraph 1</paragraphs>
    </contents>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
      <title>Überschrift Paragraph 2</title>
      <paragraphs>Paragraph 2</paragraphs>
      <paragraphs>Paragraph 3</paragraphs>
    </contents>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
      <paragraphs>Paragraph 4</paragraphs>
    </contents>
    <title>Freitext</title>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:PredefinedPage" id="Segen"/>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:PdfPage" pageNumbers="1, 3-4">
    <file>C:\Some\file.pdf</file>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:ImageContent">
     <imagePath>C:\Path\To\Image.jpg</imagePath>
    </contents>
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:ImageContent">
     <imagePath>http://www.bilder.de/bild.png</imagePath>
    </contents>
  </pages>
  <pages xsi:type="de.otpiccolo.dsa5.model.pdf.page:DefaultPage">
    <contents xsi:type="de.otpiccolo.dsa5.model.pdf.content:TableContent" columnCount="2" columnWeights="2:1">
      <rows>
        <cells>
          <content xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
            <title>Tabellen Überschrift 1 (Text)</title>
          </content>
        </cells>
        <cells>
          <content xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
            <title>Tabellen Überschrift 2 (Bild)</title>
          </content>
        </cells>
      </rows>
      <rows>
        <cells>
          <content xsi:type="de.otpiccolo.dsa5.model.pdf.content:ParagraphContent">
            <paragraphs>Eine Beschreibung des Bilds.</paragraphs>
          </content>
        </cells>
        <cells>
          <content xsi:type="de.otpiccolo.dsa5.model.pdf.content:ImageContent">
            <imagePath>C:\Pfad\Zum\Bild.png</imagePath>
          </content>
        </cells>
      </rows>
    </contents>
    <title>Tabelle</title>
  </pages>
  <pdfSource>C:\Path\optional.source.pdf</pdfSource>
  <pdfDestination>C:\Path\destination.pdf</pdfDestination>
</de.otpiccolo.dsa5.model.pdf:Pdf>
```

Man kann beliebig viele Seiten anzeigen lassen, allerdings wird der Inhalt nicht über mehrere Seiten automatisch verteilt. Man muss also selber aufpassen, dass alles auf eine Seite drauf passt. Auch müssen eventualle Sonderzeichen wie das *kaufmännische Und* XML-escaped werden. Beispiel: & -> &amp;amp;

*pdfDestination* gibt an, wohin die generierte PDF gespeichert werden soll. *pdfSource* ist optional, um eine PDF vor das generierte PDF anzuhängen (Source wird nicht überschrieben).

Seiten sind von einem bestimmten Typ (xsi:type), die dann unterschiedliche Inhalte beinhalten können.

## DefaultPage
Die *DefaultPage* ist eine leere Seite die befüllt werden kann. Sie hat ein optionales Titel-Feld (*title*) und wird dann mit Inhalt befüllt. Der Inhalt kann gemixt sein.

### DataContent
*DataContent* ruft Daten von der [Ulisses Homepage](https://dsa.ulisses-regelwiki.de) ab. Es wird in *contentType* angegeben, welchen Obertyp an Daten abgerufen wird, und in *content* welcher spezielle Fähigkiet/Vorteil/.... Man muss diese Angabe machen, wie sie in der Übersicht auf der entsprechenden *contentType*-Seite angegeben ist.

Bereits implementierte Informationen:

| ContentType | Homepage |
| --- | --- |
| *AllgemeineSonderfertigkeit* | https://dsa.ulisses-regelwiki.de/sf_allgemeine_sonderfertigkeiten.html |
| *Elfenlied* | https://dsa.ulisses-regelwiki.de/elfenliedauswahl.html |
| *Elixier* | https://dsa.ulisses-regelwiki.de/Elixier.html |
| *ErweiterterLiturgiestil* | https://dsa.ulisses-regelwiki.de/erweiterte_liturgiestilsonderfertigkeitenauswahl.html |
| *Gewandzauber* | https://dsa.ulisses-regelwiki.de/traditionsartefakt_sf_gewandzauber_auswahl.html |
| *Hexenfluch* | https://dsa.ulisses-regelwiki.de/hexenfluchauswahl.html |
| *Kampfsonderfertigkeit* | https://dsa.ulisses-regelwiki.de/sf_kampfsonderfertigkeiten.html |
| *Kampfstilsonderfertigkeit* | https://dsa.ulisses-regelwiki.de/SF_Kampfstilsonderfertigkeiten.html |
| *KarmaleSonderfertigkeit* | https://dsa.ulisses-regelwiki.de/allgemeine_karmale_sonderfertigkeitauswahl.html |
| *KarmaleTradition* | https://dsa.ulisses-regelwiki.de/karmale_traditionauswahl.html (nur der Teil in Klammern. Beispiel: Praioskirche) |
| *Liturgie* | https://dsa.ulisses-regelwiki.de/liturgieauswahl.html |
| *Liturgiestil* | https://dsa.ulisses-regelwiki.de/liturgiestilsonderfertigkeitenauswahl.html |
| *MagischeSonderfertigkeit* | https://dsa.ulisses-regelwiki.de/allgemeine_magische_sonderfertigkeit.html |
| *Nachteil* | https://dsa.ulisses-regelwiki.de/nachteilauswahl.html |
| *Predigt* | https://dsa.ulisses-regelwiki.de/predigtauswahl.html |
| *Segen* | https://dsa.ulisses-regelwiki.de/segenauswahl.html |
| *Vision* | https://dsa.ulisses-regelwiki.de/visionauswahl.html |
| *Vorteil* | https://dsa.ulisses-regelwiki.de/vorteilauswahl.html |
| *Zauber* | https://dsa.ulisses-regelwiki.de/zauberauswahl.html |
| *Zaubererweiterung* | https://dsa.ulisses-regelwiki.de/zauberauswahl.html (Spezielle Angabe, siehe unten) |
| *Zauberstil* | https://dsa.ulisses-regelwiki.de/zauberstil_sf_auswahl.html |
| *Zaubertanz* | https://dsa.ulisses-regelwiki.de/zaubertanzauswahl.html |
| *ZauberTradition* | https://dsa.ulisses-regelwiki.de/magische_traditionauswahl.html |
| *Zaubertrick* | https://dsa.ulisses-regelwiki.de/zaubertrickauswahl.html |
| *Zeremonialgegenstand* | https://dsa.ulisses-regelwiki.de/zeremonialgegenstands_sf_auswahl.html |
| *Zeremonie* | https://dsa.ulisses-regelwiki.de/zeremonieauswahl.html |

Für Zaubererweiterungen haben einen leicht anderen Syntax, da man zusätzlich zum Namen der Zaubererweiterung auch noch den Namen des Zaubers angeben muss.
Syntax: Zauber-Name#Zaubererweiterung-Name
Beispiel: Axxeleratus#Noch schneller

### ParagraphContent
*ParagraphContent* erlaubt es, Freitext in das PDF aufzunehmen. Es kann ein optionaler *title* angegeben werden. Und dann wird je ein Paragraph/Absatz in *paragraphs* angegeben.

### ImageContent
*ImageContent* erlaubt es, ein Bild in das PDF aufzunehmen. Der *imagePath* kann dabei sowohl ein Pfad im lokalen System sein, als auch eine URL zu einer Webseite. Bilder, die zu groß sind, um auf die restliche Seite zu passen, werden auf die passende Größe skaliert.

### TableContent
*TableContent* erzeugt eine Tabelle, in der beliebige Inhalte eingefügt werden können, wie sie auch auf einer *DefaultPage* zu finden sind. Es muss ein *columnCount* angegeben werden, der die Anzahl der Spalten angibt. Optional kann auch noch ein *columnWeights* angegeben werden, der das Verhältnis der Größe der Spalten auf der Seite angibt. Wenn man zB *columnWeights* auf "1:2:1" setzt, würde die mittlere Spalte 50% des Platzes einnehmen, während die anderen beiden Spalten jeweils 25% des Platzes bekommen. Wenn *columnWeights* nicht angegeben wird, werden alle Spalten gleich groß angezeigt.

Der Inhalt der Tabelle wird für jede Reihe angegeben (*rows*), und dann in jeder Reihe die einzelne Zelle (*cells*). Innerhalb der Zelle wird dann erneut der Content angegeben, wie er auch auf der *DefaultPage* angegeben wird. Die Inhalte jeder Zelle können dabei natürlich von unterschiedlicher Natur sein.

## PdfPage
*PdfPage* fügt den Inhalt einer PDF Datei zu diesem zu generierenden PDF hinzu. In *file* wird der Dateipfad zur PDF angegeben. Man kann über *pageNumbers* noch angeben, welche Seiten genau übernommen werden sollen. Wenn nicht angegeben, werden alle Seiten übernommen.

## PredefinedPage
*PredefinedPage* fügt vordefinierten Seite in die PDF. Diese sind dazu da, um häufig vorkommende Hilfen anzuzeigen, sollten diese benötigt werden. Im Feld *id* wird angegeben, welche Seite genau hinzu gefügt wird.

| ID | Beschreibung |
| --- | --- |
| *EntrueckungTrance* | Eine Übersicht, über die Status-Effekte Entrückung und Trance. |
| *FernkampfMod* | Eine Übersicht, wie Fernkampf-Angriffe modifiziert werden. |
| *Schicksalspunkte* | Eine Übersicht, wie Schicksalspunkte verwendet werden können. |
| *Segen* | Eine Übersicht über die 12 kleinen Segen, die alle Geweihten für gewöhnlich können. |
| *ZauberMod* | Eine Übersicht, wie Zauber modifiziert werden können, um ihre Wirkung zu verändern. |
| *<Geweihten>* | Eine Übersicht über einen Geweihten. Siehe Unten. |

### Geweihten-Seite
Eine Geweihten-Seite gehört auch zu den *PredefinedPage*. Sie gibt eine kurze Übersicht über den Moralkodex der Kirche sowie einige spielerische Fähigkeiten. Um sie einzubinden, muss für die ID der *PredefinedPage* der Name der Gottheit angegeben werden. Um zB. eine Übersicht über den Praios-Geweihten zu erhalten, muss für die ID *Praios* angegeben werden.

# CLI
CLI beschreibt den Aufruf des Programms über die Kommando-Zeile. Die Kommando-Zeile kann über die Tastenkombination 'Win+R' und dann 'cmd' aufgrerufen werden.

Im Ordner, wo die jar-Datei gespeichert ist, muss man dann folgenden Befehl eingeben: `java -jar "jar-datei" "C:\Pfad\Zum\Helden.xml`

Beispiel (wenn die XML Datei im selben Verzeichnis ist): `java -jar "dsa5.model-1.0.0-20240316.210355-7-jar-with-dependencies.jar" "held.xml"`

## Kommandozeile-Parameter
Über `java -jar "jar-datei" --help` kann die Hilfe des Programms aufgerufen werden. Diese zeigt, welche möglichen Argumente das Programm annehmen kann.

Es gibt einen zwingend vorhandenen Parameter, und danach bis zu zwei optionale weitere Parameter. Der erste Parameter ist der Datei-Pfad zur XML-Datei, in der die Daten zum Helden drin stehen. Der zweite Parameter gibt an, wo die generierte PDF gespeichert werden soll. Der dritte Parameter gibt an, ob eine zusätzliche PDF am Anfang der generierten PDF eingefügt werden soll.

Beispiel: `java -jar "dsa5-model.jar" "held.xml" "ausgabe.pdf" "quelle.pdf"`
Diese Angabe nimmt die Daten aus der Datei `held.xml`und schreibt sie in die Datei `ausgabe.pdf` und fügt am Anfang den Inhalt der Datei `quelle.pdf` hinzu.

Da sowohl `ausgabe.pdf` als auch `quelle.pdf` optionale Parameter sind, werden diese Werte normalerweise aus der `held.xml`-Datei genommen, falls nicht angegeben. `ausgabe.pdf` überschreibt dabei den Wert von `pdfDestination` aus der `held.xml`-Datei, und `quelle.pdf` den Wert von `pdfSource`.