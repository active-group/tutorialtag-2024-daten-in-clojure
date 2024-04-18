(ns data.active-data
  (:require [active.data.record :refer [def-record is-a?])))

;; Datenmodellierung

;; Tier (auf dem texanischen Highway) ist eins der folgenden:
;; - Gürteltiere -ODER-
;; - Papageien
;; -> gemischte Daten 

;; Gürteltier hat folgende Eigenschaften:
;; - lebendig oder nicht -UND-
;; - Gewicht
;; -> zusammengesetzte Daten

;; Papagei hat folgende Eigenschaften:
;; - Satz -UND-
;; - Gewicht

