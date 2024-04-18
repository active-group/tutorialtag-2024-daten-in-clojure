(ns data.active-data
  (:require [active.data.record :refer [def-record is-a?]]))

;; Datenmodellierung

;; Tier (auf dem texanischen Highway) ist eins der folgenden:
;; - Gürteltiere -ODER-
;; - Papageien
;; -> gemischte Daten 

;; Gürteltier hat folgende Eigenschaften:
;; - lebendig oder nicht -UND-
;; - Gewicht
;; -> zusammengesetzte Daten
(def-record dillo [alive? weight])

;; alive? und weight sind neue Objekte, können privat gemacht werden

(def dillo1 (dillo alive? true weight 10))
(def dillo2 (dillo alive? false weight 8))

;; Papagei hat folgende Eigenschaften:
;; - Satz -UND-
;; - Gewicht
(def-record parrot [sentence weight])

(def parrot1 (parrot sentence "hello!" weight 1))
(def parrot2 (parrot sentence "goodbye!" weight 2))

