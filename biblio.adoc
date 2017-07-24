= Biblio
Logiciel d’amélioration collaborative de notices bibliographiques.

== Contexte
Une notice bibliographique fournit des données sur un ouvrage ou une publication (livre, article scientifique, etc.) telles que ses auteurs, son éditeur, etc.

Ces informations sont souvent entachées d’erreurs ou difficilement exploitables : nom et prénom de l’auteur inversés ou mal orthographiés, problème des homonymes, etc. Les informations fournies par Amazon et par Google books, par exemple, peuvent ne pas correspondre. Les bibliothécaires fournissent un travail souvent de meilleure qualité, mais néanmoins imparfait et inévitablement incomplet.

Les auteurs scientifiques ont besoin de méta-données correctes pour citer adéquatement leurs sources. Bien que de nombreuses bases de données accessibles publiquement existent pour récupérer les méta-données, leur qualité nécessairement imparfaite conduit les chercheurs à passer du temps à se constituer une base de données (à peu près) à jour après vérification des données. Ce travail est dupliqué par chacun. L’objectif de ce projet est de fournir une plate-forme permettant de partager ce travail.

== Récits utilisateur
* impl partie du schéma pour livres (exclure sujet…) : FRBR Ch. 3 and 4
* @deploy, créer exemples jouets dans BD
* montrer entrées livres
* importer données livres depuis CrossRef. 
* Importer données depuis autres formats ? (FRBR Appendix. Certains éléments requièrent intervention manuelle car ambigus.)
* montrer un livre
* associer valeurs attributs à un utilisateur ou une source d’import
* trouver auto la notice d’autorité de la http://authorities.loc.gov/[Bibliothèque du Congrès] (ou Abes IdRef)
* mise à jour d’import (données ont changé côté distant)
* importer des authority records d’autres sources ?
* permettre changements de valeurs et commentaires
* permettre réponse
* implémenter relations ? FRBR Ch. 5
* implémenter au moins certains éléments du Ch. 7
* vérifier auto si directives ISBD sont suivies ?
* réification pour montrer seulement des informations objectives : sujet tel que déterminé par source…
* calcul d’une croyance par défaut (le dernier qui a parlé sauf si pas fiable…)
* l’utilisateur peut accorder sa confiance

== Références
* http://www.ifla.org/en/publications/functional-requirements-for-bibliographic-records[Standard FRBR] : IFLA Study Group on the Functional Requirements for Bibliographic Records, Functional Requirements for Bibliographic Records: Final Report (München: K.G. Saur, 1998). (Autres [standards](http://www.ifla.org/node/8750) IFLA.)
* International Standard Bibliographic Description (https://en.wikipedia.org/wiki/International_Standard_Bibliographic_Description[ISBD]), http://www.ifla.org/files/assets/cataloguing/isbd/isbd-cons_20110321.pdf[Consolidated Edition] (http://www.bnf.fr/documents/isbd_trad_francais.pdf[en français]) (http://gen.lib.rus.ec/book/index.php?md5=242B9D9F7BC495827B428B334C3819E1[Preliminary Consolidated Edition], 2007)
* Sudoc utilise un format RDF national, géré par les bibliothécaires. Viellles notices sont de moindre qualité mais les plus récentes devraient être bonnes. http://www.sudoc.fr/146956419.rdf[Exemple]. Pas ou très peu d’articles (pas sa vocation première).
* Copac équivalent du Sudoc en GB, utilise format http://www.loc.gov/standards/mods/[MODS].
* http://data.bnf.fr[BNF] : dépôt légal, acquisitions.
* Base CrossRef (https://github.com/CrossRef/rest-api-doc/blob/master/rest_api.md[API]) très riche, > 80 M enregistrements. Bonne qualité pour démarrer. Articles de revue académique, souvent.
* http://m.abes.fr/Acces-direct-a/Pour-les-developpeurs[Web services] de l’ABES (Idref…).
* http://domybiblio.net/search/[Exemple] d’exploitation.
* Idref, service web en ligne pour identifier une personne. Permet ensuite de récupérer Orcid, viaf etc. puis de récupérer des ressources. Permet d’interroger le catalogue du Sudoc à partir de noms. http://documentation.abes.fr/aideidrefdeveloppeur/ch02s01.html[API Solr] pour interroger IdRef.

