(ns data.defrecord)

(defrecord Dillo [alive? weight])

(def dillo1 (->Dillo true 10))
(def dillo2 (->Dillo false 8))

(defrecord Parrot [sentence weight])

(def parrot1 (->Parrot "hello!" 1))
(def parrot2 (->Parrot "goodbye!" 2))

;; (.weight dillo1) reflection warning
;; (:weight dillo1)

(defn run-over-animal
  [animal]
  (cond
    (instance? Dillo animal)
    (assoc animal :alive? false)

    (instance? Parrot animal)
    (assoc animal :sentence "")))

;; Typ-Tag steht jetzt dran:
;; - immer noch kein "information hiding"
;; - Felder können entfernt / hinzugefügt werden
;; - gelegentlich Probleme mit Records bei Ahead-of-time-Compilierung
;; --> aber gut als Java-Interop
;; - kaum integriert clojure.spec
