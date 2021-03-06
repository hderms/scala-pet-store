package io.github.pauljamescleary.petstore.model

case class Pet(
  name: String,
  category: String,
  bio: String,
  status: Status = Available,
  tags: Set[String] = Set.empty,
  photoUrls: Set[String] = Set.empty,
  id: Option[Long] = None
)
