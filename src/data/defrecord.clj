(ns data.defrecord)

(defrecord Dillo [alive? weight])

(def dillo1 (->Dillo true 10))
(def dillo2 (->Dillo false 8))

(defrecord Parrot [sentence weight])

(def parrot1 (->Parrot "hello!" 1))
(def parrot2 (->Parrot "goodbye!" 2))

