(ns ags799.mock-oauth2.main
  (:gen-class)
  (:require [compojure.api.sweet]
            [ring.adapter.jetty]
            [ring.util.http-response]))

(def app (compojure.api.sweet/api
           {:swagger {:ui "/" :spec "/swagger.json" :data {:info {:title "Mock OAuth2" :description "A mock OAuth 2 service."}}}}
           (compojure.api.sweet/GET "/ping" []
             :return {:result String}
             :summary "returns \"pong\""
             (ring.util.http-response/ok {:result "pong"}))))

(defn -main [] (ring.adapter.jetty/run-jetty app {:port 8080}))