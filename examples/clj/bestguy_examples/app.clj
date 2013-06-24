(ns bestguy-examples.app
  (:require [compojure.core :refer :all]
            [ring.adapter.jetty :as jetty])
  (:gen-class))

(defroutes app
  (GET "/" r "bestguy example app"))

(defn create-app [port]
  (jetty/run-jetty #'app {:join? false :port port}))

(defn -main
  [& args]
  (let [port (Integer/parseInt (first args))
        server (create-app port)]
    (def server server)))
