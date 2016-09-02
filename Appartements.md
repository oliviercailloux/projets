#Recherche d’appartement à louer
Les sites de location (type http://pap.fr) proposent généralement des moyens rudimentaires de recherche parmi les annonces existantes. Ce projet vise à doter l’utilisateur de moyens d’indiquer ses préférences d’une manière riche, afin de lui montrer les annonces qui lui conviennent le mieux d’abord. En particulier, au lieu de filtrer de façon binaire (ex. : exclure tous les appartements plus petits que x m²), le système permettra la compensation (ex. : inclure une annonce pour un appartement très petit s’il est très bon sur les autres critères) ; et le système permettra d’inclure comme critère la distance (en transport public) à des lieux d’intérêts pour l’utilisateur tels que son lieu de travail.
##Récits utilisateur
* Entrée nouvelle annonce.
* Un utilisateur indique son utilité (en argent) concernant les différents aspects d’un appartement. Pour chaque critère (ex nb pièces) il indique combien il est prêt à donner pour passer d’une valeur à une autre (ex 30 € pour gagner un mètre carré).
* Un utilisateur voit une liste d’annonces, ordonnée selon leur utilité à ses yeux.
* L’utilisateur indique son utilité de localisation : il indique un lieu d’intérêt et son utilité pour se rapprocher de ce lieu, en distance "transport public".
* Extraction d’annonces depuis pap.
* Alertes : l’utilisateur indique à quel niveau d’utilité il veut être alerté en cas d’apparition d’une nouvelle annonce intéressante.
* L’utilisateur indique son utilité de localisation par rapport à plusieurs lieux.
* L’utilisateur se fait aider pour déterminer son utilité. Il voit le résultat de sa spécification d’utilité sur des annonces concrètes du système.
* L’utilisateur peut indiquer en voyant la liste d’annonces qu’il préfère une annonce à une autre alors qu’elle est classé sous la deuxième. Le système lui permet alors de corriger son utilité pour que le classement en question soit rétabli.
* Extraction annonce depuis le système dans un format XML à spécifier (chercher un format existant ou créer).
##Informations en vrac
* http://pap.fr : semblent ouverts.
* http://www.seloger.com/ : verrouillage légal.
* GTFS : http://wiki.openstreetmap.org/wiki/General_Transit_Feed_Specification https://github.com/OneBusAway/onebusaway-gtfs-modules http://transitfeeds.com/ http://opendata.stif.info/explore/dataset/offre-horaires-tc-gtfs-idf/
http://www.nctr.usf.edu/2011/05/enabling-cost-effective-multimodal-trip-planners-through-open-transit-data-2/
http://www.opentripplanner.org/ 