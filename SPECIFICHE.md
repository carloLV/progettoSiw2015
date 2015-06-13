# progettoSiw2015

SPECIFICHE

Si vuole realizzare un sistema informativo su Web per la gestione degli ordini di una piccola azienda 
che effettua il commercio al dettaglio dei prodotti ordinati
Due tipologie di attori interagiscono con il sistema: i dipendenti e l'amministrazione
Il cliente può svolgere le seguenti operazioni:
Consultazione catalogo prodotti
Creazione di un ordine
Consultazione dei propri ordini
Inserimento data terminazione di un prodotto
L'amministrazione può svolgere le seguenti operazioni:
Inserimento di un prodotto nel catalogo
Inserimento di un fornitore nella anagrafica fornitori
Invio\modifica di un ordine inserito in precedenza

Per ogni prodotto sono di interesse un nome, un codice, un costo, la data di consegna e di terminazione 
Ogni prodotto può essere fornito da un solo fornitore, ogni fornitore può fornire uno o più prodotti
Ogni fornitore ha una partita iva e un indirizzo, telefono, indirizzo di posta elettronica
Ogni dipendente e amministratore ha nome, cognome, data di nascita, data di registrazione, 
indirizzo, indirizzo di posta elettronica


Caso d'uso UC1: consulta listino
Attore primario: utente registrato
Scenario principale di successo: 
L'utente consulta il catalogo dei prodotti
L'utente sceglie un prodotto 
L'utente ripete i passi precedenti un numero indefinito di volte

Caso d'uso UC2: effettua ordine
Attore primario: utente registrato
Scenario principale di successo: 
L'utente crea un ordine
L'utente sceglie il fornitore per quell'ordine e ne consulta il catalogo dei prodotti
L'utente sceglie un prodotto e aggiunge codice e quantità del prodotto scelto all'ordine
--Il sistema ha memoria della data di terminazione dei prodotti e se necessario avvisa l'utente di ordinare una
  quantità maggiore
Il sistema imposta il prezzo unitario del prodotto scelto al prezzo corrente di listino
Il sistema registra la riga ordine
L'utente ripete i due passi precedenti finché necessario
L'utente "chiude" l'ordine
Il sistema registra l'ordine
Precondizioni: L'utente è identificato e autenticato

Caso d'uso UC3: consulta i propri ordini
Attore primario: utente
Scenario principale:
L'utente consulta l'elenco degli ordini presenti nel sistema
Il sistema mostra al cliente l'elenco degli suoi ordini
L'utente chiede il dettaglio di un ordine
Il sistema mostra il dettaglio dell'ordine
