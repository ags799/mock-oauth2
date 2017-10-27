(ns ags799.mock-oauth2.integration.ping-test
  (:require [clojure.test :refer :all]
            [clj-http.client :as http]))

(defn url [path] (str "http://localhost:8080/" path))

(deftest ping (is (= "{\"result\":\"pong\"}" (:body (http/get (url "ping"))))))