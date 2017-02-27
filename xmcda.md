#Services web XMCDA
##Objectif
Permettre l’invocation de services web XMCDA (spécialisés en aide multicritère à la décision) grâce à une interface graphique, fournir des outils divers pour faciliter leur usage. La connaissance de l’aide multicritère à la décision n’est pas requise.
##Contexte
Une série de services web ouverts permet d’utiliser les méthodes d’aide multicritère à la décision. Ils reposent sur le format XMCDA et sur le logiciel Diviz, qui permet l’invocation des services sans devoir programmer. L’utilisateur doit cependant fabriquer à la main les fichiers XML d’entrée (ou convertir du CSV), et plus généralement il n’existe pas d’intégration des outils dans un logiciel très simple d’emploi.
##Récits utilisateur
* Interface graphique web (ou SWT) et entités pour créer et éditer les objets principaux de xmcda-modular. Commencer par Alternatives, Criteria, PerformanceTable.
* Export de parties au format xmcda-modular (XM).
* Export de parties au format xmcda2 (X2).
* En extraire une bibliothèque permettant de développer une application similaire mais qui fonctionne en local.
* Interface graphique SWT en plus de web (ou web en plus de SWT).
* Gestion multiples utilisateurs aux données séparées.
* De descripteur diviz : création d’un schéma XM.
* De schéma XM : instanciation des données au format XM.
* De descripteur diviz : instanciation des données au format X2.
* Envoi des données X2 au WS X2.
* Envoi message via JMS quand réponse est prête.
* Affichage et manipulation du résultat.
* Création d’un WS XM façade au WS X2.
* Interface graphique pour créer les objets nécessaires à une désagrégation de groupe (tri, multiples décideurs avec exemples partagés dans catégories pour chacun).
* Projets avec (certaines) données partagées entre plusieurs utilisateurs.
* Permettre à chaque décideur de s’identifier pour entrer ses données (avec pwd ou sans, décidé par l’administrateur).
* Étendre pour permettre l’affectation de points à de multiples catégories, pour un exemple donné.
* Import csv / excel (via WS existant éventuellement).

##Références
* [xmcda-modular](https://github.com/xmcda-modular) sur Github.
* [XMCDA-2.2.1-JAXB](https://github.com/oliviercailloux/XMCDA-2.2.1-JAXB/) : génération et lecture de fichiers au format X2.
* [XMCDA](http://www.decision-deck.org/xmcda/), site officiel.
* [diviz](http://www.decision-deck.org/diviz/), site officiel.
* [exemple](http://www.decision-deck.org/ws/wsd-rankAlternativesValues-RXMCDA.html) de fichier description Diviz: voir description.xml.
* [test-call-xmcda-ws](https://github.com/oliviercailloux/test-call-xmcda-ws)

##Nom technique du projet
xmcda
