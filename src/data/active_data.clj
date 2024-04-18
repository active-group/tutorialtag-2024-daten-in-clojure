(ns data.active-data
  (:require [active.data.record :refer [def-record is-a?]]
            [active.data.realm :as realm]
            [active.data.realm.attach :as realm-attach]
            [active.data.realm.validation :as realm-validation]))

;; Datenmodellierung

;; Tier (auf dem texanischen Highway) ist eins der folgenden:
;; - Gürteltiere -ODER-
;; - Papageien
;; -> gemischte Daten 

;; Gürteltier hat folgende Eigenschaften:
;; - lebendig oder nicht -UND-
;; - Gewicht
;; -> zusammengesetzte Daten
(def-record dillo [dillo-alive? :- realm/boolean
                   dillo-weight :- realm/number])

;; alive? und weight sind neue Objekte, können privat gemacht werden

(def dillo1 (dillo dillo-alive? true dillo-weight 10))
(def dillo2 (dillo dillo-alive? false dillo-weight 8))

;; Papagei hat folgende Eigenschaften:
;; - Satz -UND-
;; - Gewicht
(def-record parrot [parrot-sentence :- realm/string
                    parrot-weight :- realm/number])

(def parrot1 (parrot parrot-sentence "hello!" parrot-weight 1))
(def parrot2 (parrot parrot-sentence "goodbye!" parrot-weight 2))

(def animal
  (realm/union dillo parrot))

(realm-attach/defn run-over-animal :- animal
  [animal :- animal]
  (cond
    (is-a? dillo animal)
    (dillo-alive? animal false)

    (is-a? parrot animal)
    (parrot-sentence animal "")))
