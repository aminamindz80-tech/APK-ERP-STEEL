# SG STEEL - application Android hors ligne (lecture seule)
Les données (BC, BL, articles, stock, clients, mouvements) sont **dans l'APK** ; l'application n'a **aucune permission réseau**.
Installée à côté de l'autre application (identifiant `com.sgsteel.erp.horsligne`).

## Obtenir l'APK
1. Copiez dans votre dépôt GitHub SG-STEEL-ERP : le dossier `android_hors_ligne/` et le dossier `.github/` (fichier `workflows/apk-hors-ligne.yml`).
2. GitHub > Actions > « APK hors ligne » > Run workflow.
3. Quand c'est vert, ouvrez l'exécution > Artifacts > `SG_STEEL_hors_ligne_apk` > téléchargez, dézippez, installez l'APK.

## Mettre à jour les données
`python plat/generer_donnees_hors_ligne.py` (lit `plat/data/atelier.db`), puis refaire l'étape « Obtenir l'APK ».
